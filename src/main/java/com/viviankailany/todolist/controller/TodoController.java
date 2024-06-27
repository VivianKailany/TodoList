package com.viviankailany.todolist.controller;

import com.viviankailany.todolist.entity.Todo;
import com.viviankailany.todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping()
    List<Todo> createTodoList(@RequestBody @Valid Todo todo){
        return todoService.createTodoList(todo);
    }

    @GetMapping
    List<Todo> listTodo(Todo todo){
       return todoService.listTodo();
    }


    @PutMapping
    List<Todo> updateTodo(@RequestBody Todo todo){

        return todoService.updateTodo(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> deleteTodo(@PathVariable Long id){
        return todoService.deleteTodo(id);
    }
}
