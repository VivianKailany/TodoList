<h1 align="center">TODO List</h1>


API para gerenciar tarefas (CRUD).

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-webflux)
- [H2 Database](https://mvnrepository.com/artifact/com.h2database/h2/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP:

- Criar Tarefa
```
$ http POST :8080/todos

[
  {
  "descricao": "Ir à academia",
  "nome": "academia",
  "prioridade": 5,
  "realizado": false
}

]
```

- Listar Tarefas
```
$ http GET :8080/todos

[
  {
  "descricao": "Ir à academia",
  "nome": "academia",
  "prioridade": 5,
  "realizado": false
}

]
```

- Atualizar Tarefa
```
$ http PUT :8080/todos/1

[
  {
  "descricao": "Ir à academia",
  "nome": "academia",
  "prioridade": 1,
  "realizado": false
}

]
```

- Remover Tarefa
```
http DELETE :8080/todos/1

[ ]
```
