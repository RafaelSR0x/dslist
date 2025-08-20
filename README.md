# DSList

Esta aplicação backend tem como objetivo listar jogos cadastrados. Ela disponibiliza endpoints REST para consultar e manipular listas de jogos.

## Tecnologias utilizadas

- **Java 17**: Linguagem principal do projeto.
- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **Spring Data JPA**: Abstração para persistência e consultas ao banco de dados.
- **Banco de dados relacional**: (H2 por padrão, pode ser alterado para PostgreSQL, MySQL, etc.)
- **Maven**: Gerenciador de dependências e build.

## Principais dependências

- `spring-boot-starter-web`: Para criação da API REST.
- `spring-boot-starter-data-jpa`: Para integração com JPA/Hibernate.
- `spring-boot-starter-test`: Para testes automatizados.
- Driver do banco de dados utilizado (`h2`, `postgresql`, `mysql`).

## Como clonar o repositório

```bash
git clone https://github.com/RafaelSR0x/dslist.git
cd dslist
```

## Como executar o projeto

1. Certifique-se de ter o Java 17 e o Maven instalados.
2. Execute o comando abaixo para iniciar a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```
   Ou, se estiver no Windows:
   ```bash
   mvnw.cmd spring-boot:run
   ```
3. Acesse a aplicação em `http://localhost:8080`.

## Configuração do banco de dados

Por padrão, o projeto utiliza o banco H2 em memória. Para alterar para outro banco, edite o arquivo `src/main/resources/application.properties`.

## Endpoints disponíveis

- **GET /games**: Retorna todos os jogos cadastrados.
  - Exemplo de resposta:
    ```json
    [
      {
        "id": 1,
        "title": "The Witcher 3",
        "platform": "PC, PS4, Xbox One",
        ...
      },
      ...
    ]
    ```
- **GET /games/{id}**: Retorna os detalhes de um jogo específico.
- **GET /lists**: Retorna todas as listas de jogos.
- **GET /lists/{listId}/games**: Retorna os jogos de uma lista específica.

## Rodando os testes

Execute:
```bash
./mvnw test
```

## Estrutura do projeto

- `src/main/java/com/project_dslist/dslist/`: Código fonte principal
- `src/test/java/com/project_dslist/dslist/`: Testes automatizados
- `src/main/resources/`: Configurações e arquivos estáticos

## Contribuição

Pull requests são bem-vindos! Para contribuir, crie uma branch, faça suas alterações e envie um PR.

## Licença

Este projeto está sob a licença MIT.
