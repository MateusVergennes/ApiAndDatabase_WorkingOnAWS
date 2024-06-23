# Projeto Spring Boot com PostgreSQL e H2 na AWS

Projeto Spring Boot para criação de uma API com integração de banco de dados PostgreSQL e H2 para testes.

## Descrição

Este projeto implementa uma API utilizando o framework Spring Boot, que integra dois bancos de dados diferentes:
- PostgreSQL: Utilizado como banco de dados principal para a aplicação em produção.
- H2: Utilizado para testes e desenvolvimento local.

A aplicação é preparada para ser hospedada na AWS (Amazon Web Services), utilizando seus serviços de nuvem para deploy e escalabilidade.

## Funcionalidades

- Exemplo de CRUD (Create, Read, Update, Delete) para entidades principais.
- Integração com bancos de dados utilizando JPA (Java Persistence API).
- Configuração de segurança básica.
- Dockerização do ambiente de desenvolvimento.

## Pré-requisitos

- Java JDK 21 ou superior.
- Maven 3.x.
- Docker (opcional para ambiente de desenvolvimento).

## Instalação

1. Clone o repositório
2. Configure as propriedades do banco de dados em `src/main/resources/application.properties`.
3. Compile o projeto: `mvn clean install`
4. Execute a aplicação: `java -jar target/nome-do-arquivo.jar`

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests ou abrir novas issues.

## Licença

Este projeto está licenciado sob a licença MIT 

