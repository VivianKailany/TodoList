package com.viviankailany.todolist.service;

import com.viviankailany.todolist.entity.Todo;
import com.viviankailany.todolist.reposity.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> createTodoList(Todo todo) {
        todoRepository.save(todo);
        return listTodo();
    }

    public List<Todo> listTodo() {
        Sort sort = Sort.by("prioridade").descending()
                .and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> updateTodo(Todo todo) {
        todoRepository.save(todo);
        return listTodo();
    }

    public List<Todo> deleteTodo(Long id) {
        todoRepository.deleteById(id);
        return listTodo();
    }
}
