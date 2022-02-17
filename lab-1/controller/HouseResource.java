package com.examly.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.House;
import com.examly.springapp.HouseRepository;

@RestController
@RequestMapping(value = "/")
public class HouseResource {
    @Autowired(required = true)
    HouseRepository houseRepository;

    @PostMapping(value = "saveHouse")
    public List<House> load(@RequestBody House house) {
        houseRepository.save(house);
        return houseRepository.findAll();
    }

    // @GetMapping(value="getByType/type={houseType}")
    @GetMapping(value = "/getByType")
    public Optional<House> getByType(@RequestParam("type") String houseType) {
        return houseRepository.findByType(houseType);
    }

    //@GetMapping(value = "getHouse/id={houseId}")
    @GetMapping(value = "/getHouse")
    public Optional<House> getHouse(@RequestParam("id") String houseId) {
        return houseRepository.findByHouseId(houseId);
    }

    @Transactional
    //@GetMapping(value = "deleteHouse/id={houseId}")
    @GetMapping(value = "/deleteHouse")
    public List<House> deleteHouse(@RequestParam("id") String houseId) {
        houseRepository.deleteByHouseId(houseId);
        return houseRepository.findAll();
    }

    /*
     * @Transactional
     * 
     * @GetMapping(value="deleteHouse/type={htype}") //public List<House>
     * deleteHouseType(@PathVariable("htype") String htype) { public void
     * deleteHouseType(@PathVariable("htype") String htype) {
     * houseRepository.deleteByType(htype); ///return houseRepository.findAll(); }
     */
    @GetMapping(value = "getAllHouse")
    public List<House> getAll() {
        return houseRepository.findAll();
    }

}
