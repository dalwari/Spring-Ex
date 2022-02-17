package com.examly.springapp.controller;

import com.examly.springapp.Car;
import com.examly.springapp.CarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class CarResource {
    @Autowired
    CarRepository carRepository;

    @GetMapping(value = "getCars")
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @GetMapping(value = "/getCar")
    public Optional<Car> getCarById(@RequestParam("id") String CarId) {
        return carRepository.findByCarId(CarId);
    }
    @Transactional
    @GetMapping(value="/deleteCar")
    public List<Car> deleteCar(@RequestParam("id") String id){
        carRepository.deleteByCarId(id);
        return carRepository.findAll();
    }
    @PostMapping("saveCar")
    public List<Car> load(@RequestBody Car car) {
        carRepository.save(car);
        return carRepository.findAll();
    }
    @PostMapping("/editCar")
    public Optional<Car> updateCar(@RequestParam("id") String id,@RequestBody Car c){
        Car car=carRepository.findByCarId(id).get();
        car.setCarModel(c.getCarModel());
        car.setCarNo(c.getCarNo());
        car.setStatus(c.getStatus());
        carRepository.save(car);
        return carRepository.findByCarId(id);
    }
}
