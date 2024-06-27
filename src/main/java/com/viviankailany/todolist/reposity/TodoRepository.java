package com.viviankailany.todolist.reposity;

import com.viviankailany.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todo, Long> {

}
