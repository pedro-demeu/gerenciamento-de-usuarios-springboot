package com.gerenciadordeusuarios.services;

import com.gerenciadordeusuarios.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gerenciadordeusuarios.repositories.UserRepository;
import com.gerenciadordeusuarios.services.exeptions.ResourceNotFoundException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        try {
            return userRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Usuário com ID " + id + " não encontrado"));
        } catch (Exception e) {
            throw new ResourceNotFoundException("Erro ao buscar usuário com ID " + id);
        }
    }

    @Override
    @Transactional
    public void delete(Long id) {
        try {
            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
            } else {
                throw new ResourceNotFoundException("Usuário com ID " + id + " não encontrado");
            }
        } catch (Exception e) {
            throw new ResourceNotFoundException("Erro ao excluir usuário com ID " + id);
        }
    }

    @Override
    @Transactional
    public User update(Long id, User user) {
        try {
            if (userRepository.existsById(id)) {
                user.setId(id);
                return userRepository.save(user);
            } else {
                throw new ResourceNotFoundException("Usuário com ID " + id + " não encontrado");
            }
        } catch (Exception e) {
            throw new ResourceNotFoundException("Erro ao atualizar usuário com ID " + id);
        }
    }

    @Override
    @Transactional
    public User insert(User user) {
        return userRepository.save(user);
    }
}
