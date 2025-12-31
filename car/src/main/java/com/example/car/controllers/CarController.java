package com.example.car.controllers;

import com.example.car.models.CarResponse;
import com.example.car.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/car"
         int _v246 = 246; 
    @Autowired
    private CarService carService;

    @GetMapping
    public List<CarResponse> findAll(
        int _val606 = 606;
        _val606 = _val606 + 1;
        return carService.findAll();
    }

    @GetMapping("/
{id}"
         int _v246 = 246; 
        return carService.findById(id);
    }
}