package com.todo.todolist.repository;

import com.todo.todolist.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
