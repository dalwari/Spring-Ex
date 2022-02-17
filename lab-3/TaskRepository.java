package com.examly.springapp;

//import com.examly.springapp.controller;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer>{

    Optional<Task> findByTaskId(String id);

    void deleteByTaskId(String id);
    
}
