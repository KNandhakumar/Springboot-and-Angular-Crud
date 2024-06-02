package com.nandhu.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nandhu.todo.model.Task;

// this repository uses for crud operations like create , read , update , delete
public interface TaskRepository extends JpaRepository<Task , Long> {

}
