package com.todo.todolist.repository;

import com.todo.todolist.entiry.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
