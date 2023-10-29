# Gerenciador de Usuários

Este é um projeto de um Gerenciador de Usuários desenvolvido com Spring Boot.

## Descrição

Este aplicativo tem como objetivo fornecer funcionalidades para gerenciar informações de usuários. Ele é construído usando o framework Spring Boot, o que o torna eficiente, escalável e pronto para produção.

## Recursos

- Cadastro, atualização, exclusão e listagem de usuários.
- Persistência de dados usando o banco de dados H2.
- API RESTful para interação com o aplicativo.

## Pré-requisitos

Antes de executar o aplicativo, verifique se você tem as seguintes ferramentas instaladas:

- Java Development Kit (JDK)
- Maven
- Git

## Clone este repositório:

```bash
git clone https://github.com/pedro-demeu/gerenciamento-de-usuarios-springboot.git
```

## Navegue até a pasta do projeto:

```bash
cd gerenciador-de-usuarios
```

## Execute o aplicativo usando o Maven:

```bash
mvn spring-boot:run
```

O aplicativo estará disponível em http://localhost:8080.

### Endpoints da API

- **GET /users:** Retorna a lista de usuários.
- **GET /users/{id}:** Retorna os detalhes de um usuário específico.
- **POST /users:** Cria um novo usuário.
- **PUT /users/{id}:** Atualiza um usuário existente.
- **DELETE /users/{id}:** Exclui um usuário.

### Configuração do Banco de Dados

O aplicativo está configurado para usar o banco de dados H2 em memória por padrão. Você pode acessar o console do H2 em [http://localhost:8080/h2-console](http://localhost:8080/h2-console) com as seguintes configurações:

- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `SA`
- **Password:** (deixe em branco)

### Contribuindo

Sinta-se à vontade para contribuir para este projeto. Basta seguir estas etapas:

1. Fork este repositório.
2. Crie um branch para sua funcionalidade: `git checkout -b minha-nova-funcionalidade`
3. Faça suas alterações e adicione-as: `git add .`
4. Faça um commit de suas alterações: `git commit -m 'Adicionando nova funcionalidade'`
5. Faça o push para o branch: `git push origin minha-nova-funcionalidade`
6. Envie um pull request.
