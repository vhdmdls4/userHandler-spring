# Projeto Java Web com Spring Boot - Aprendizados e Implementações ☕♨️

Este projeto foi desenvolvido como parte do curso "Seu primeiro projeto Java Web no Spring Boot 2022" da DevSuperior - Escola de Programação. O objetivo do projeto é demonstrar como construir uma API REST com banco de dados usando Java e Spring Boot.

## Pré-requisitos
Antes de iniciar este projeto, é recomendado ter conhecimento prévio em:
- Lógica de programação (em qualquer linguagem)
- Programação orientada a objetos (em qualquer linguagem)

## Ferramentas Utilizadas
- Spring Tool Suite (STS) ou IntelliJ IDEA 2023.2 ou IDE de preferência
- Postman

## Objetivos da Aula
Durante a aula, foram abordados os seguintes objetivos:
- Resgatar fundamentos de programação
- Colocar em prática esses fundamentos
- Criar um pequeno sistema com ferramentas e práticas de mercado
- Dar mais um passo em direção à preparação para o mercado

## Visão Geral do Sistema
O sistema desenvolvido é uma API REST que gerencia usuários e departamentos. Os principais casos de uso incluem:
- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

## Passos da Aula
Os principais passos abordados durante a aula foram os seguintes:
- Criar o projeto
- Implementar o modelo de domínio
- Mapeamento objeto-relacional com JPA
- Configurar o banco de dados H2
- Criar os endpoints da API REST

## Trechos de Código para Copiar
### Configuração do Maven Resources Plugin

___xml___: 
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-resources-plugin</artifactId>
    <version>3.1.0</version>
</plugin>

### Configurações do Banco de Dados
___properties___: 

#### Dados de conexão com o banco H2

spring.datasource.url=jdbc:h2:mem:testdb

spring.datasource.username=sa

spring.datasource.password=

#### Configuração do cliente web do banco H2
spring.h2.console.enabled=true

spring.h2.console.path=/h2-console

#### Configuração para mostrar o SQL no console
spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true


### Script SQL
___sql___: 

INSERT INTO tb_department(name) VALUES ('Gestão');

INSERT INTO tb_department(name) VALUES ('Informática');


INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');

INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');

INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');

## Futuras implementações 🚧
- Adicionar endereço aos usuários usando API ViaCep para exercitar uso da lib Feign 

Este projeto serve como um excelente ponto de partida para quem está iniciando no desenvolvimento Java Web com Spring Boot. Ao seguir os passos e códigos fornecidos, você será capaz de construir uma API REST funcional e aprender conceitos essenciais para o desenvolvimento web moderno.
