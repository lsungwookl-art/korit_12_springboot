package com.todolist.todolist.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository extends JpaRepository<Todo, Long> {
    // 특정 사용자의 할 일만 조회하는 기능
    // /api/todos/search/findByUser_Id?id=1 등으로 호출 가능
    List<Todo> findByUser_Id(Long id);
}