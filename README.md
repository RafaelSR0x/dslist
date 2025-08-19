# DSList

Esta aplicação backend tem como objetivo listar jogos cadastrados. Por enquanto, ela disponibiliza um endpoint GET em `/games` que retorna todos os jogos registrados no sistema.

## Tecnologias utilizadas

- **Java 17**: Linguagem principal do projeto.
- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **Spring Data JPA**: Abstração para persistência e consultas ao banco de dados.
- **Banco de dados relacional**: (ex: H2, PostgreSQL, MySQL) para armazenar os dados dos jogos.
- **Maven**: Gerenciador de dependências e build.

## Principais dependências

- `spring-boot-starter-web`: Para criação da API REST.
- `spring-boot-starter-data-jpa`: Para integração com JPA/Hibernate.
- `spring-boot-starter-test`: Para testes automatizados.
- Driver do banco de dados utilizado (ex: `h2`, `postgresql`, `mysql`).

## Como clonar o repositório

Para obter o código-fonte da aplicação, execute o comando abaixo no terminal:

```
git clone https://github.com/seu-usuario/dslist.git
```

Depois, acesse a pasta do projeto:

```
cd dslist
```

Pronto! Agora você pode seguir com a configuração e execução do projeto conforme necessário.

## Passo a passo do desenvolvimento

1. Criação do projeto Spring Boot com Java 17.
2. Configuração das dependências no Maven (Spring Boot, Spring Data JPA, banco de dados).
3. Modelagem da entidade `Game` para representar os jogos.
4. Implementação do repositório JPA para acesso aos dados dos jogos.
5. Criação do endpoint GET `/games` para listar todos os jogos cadastrados.
6. Testes básicos para garantir o funcionamento da API.

## Sobre o autor

___
Craido por [RafaelSR0x](https://github.com/RafaelSR0x)
