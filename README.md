# Task Manager

Uma aplicação simples de gerenciamento de tarefas construída com Spring Boot e Kotlin.

## Descrição

Esta aplicação permite criar, visualizar, atualizar e excluir tarefas. É uma aplicação básica que pode ser expandida para incluir mais funcionalidades conforme necessário.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para construção de aplicações Java/Kotlin.
- **Kotlin**: Linguagem de programação moderna e segura.
- **Spring Data JPA**: Abstração de persistência de dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências.



## Configuração

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/taskmanager.git
   cd taskmanager

./mvnw spring-boot:run


Endpoints
GET /tasks: Retorna todas as tarefas.
POST /tasks: Cria uma nova tarefa.
PUT /tasks/{id}: Atualiza uma tarefa existente.
DELETE /tasks/{id}: Exclui uma tarefa.
Inicialização do Banco de Dados
O banco de dados H2 é inicializado com alguns dados de exemplo definidos no arquivo src/main/resources/data.sql.

Contribuição
Faça um fork do projeto.
Crie uma nova branch (git checkout -b feature/nova-funcionalidade).
Faça commit das suas alterações (git commit -am 'Adiciona nova funcionalidade').
Faça push para a branch (git push origin feature/nova-funcionalidade).
Crie um novo Pull Request.
