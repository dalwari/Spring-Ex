package com.examly.springapp;
//import com.examly.springapp.controller.Optional;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,Integer>{

    Optional<House> findByType(String houseType);

    Optional<House> findByHouseId(String houseId);

    void deleteByHouseId(String houseId);
    //void deleteByType(String htype);
}
