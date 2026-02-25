package com.todolist.todolist;

import com.todolist.todolist.domain.TodoRepository;
import com.todolist.todolist.domain.User;
import com.todolist.todolist.domain.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
@AllArgsConstructor
public class TodolistApplication implements CommandLineRunner {
	private UserRepository userRepository;
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("김일","1234", "USER");
		User user2 = new User("이이","7890", "ADMIN");
		userRepository.saveAll(Arrays.asList(user1));
	}
}
