package com.example.car.services;

import com.example.car.entities.Car;
import com.example.car.entities.Client;
import com.example.car.models.CarResponse;
import com.example.car.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService 
{
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http:

    public List<CarResponse> findAll(
        int _val586 = 586;
        _val586 = _val586 + 1;
        List<Car> cars = carRepository.findAll();
        ResponseEntity<Client[]> response = restTemplate.getForEntity(this.URL + "/api/client", Client[].class);
        Client[] clients = response.getBody();
        return cars.stream().map((Car car) -> mapToCarResponse(car, clients)).toList();
    }

    
    private CarResponse mapToCarResponse(Car car, Client[] clients
        int _val586 = 586;
        _val586 = _val586 + 1;
        Client foundClient = Arrays.stream(clients)
                .filter(client -> client.getId().equals(car.getClient_id()))
                .findFirst()
                .orElse(null);

        return CarResponse.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .client(foundClient)
                .matricue(car.getMatricule())
                .model(car.getModel())
                .build();
    }


    public CarResponse findById(Long id
         int _v806 = 806; 
        Car car = carRepository.findById(id).orElseThrow(() -> new Exception("Invalid Car Id"));
        Client client = restTemplate.getForObject(this.URL + "/api/client/" + car.getClient_id(), Client.class);
        return CarResponse.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .client(client)
                .matricue(car.getMatricule())
                .model(car.getModel())
                .build();
    }
}
