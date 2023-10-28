package com.gerenciadordeusuarios.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadordeusuarios.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
