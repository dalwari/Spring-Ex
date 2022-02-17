package com.examly.springapp;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface CarRepository extends JpaRepository<Car,Integer>{
    Optional<Car> findByCarId(String ci);

    void deleteByCarId(String id);  
    
}
