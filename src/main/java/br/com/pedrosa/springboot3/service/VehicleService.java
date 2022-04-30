package br.com.pedrosa.springboot3.service;

import br.com.pedrosa.springboot3.dto.Car;
import br.com.pedrosa.springboot3.dto.Truck;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    public Truck getTruck(){
        var truck = new Truck(1,"Volvo");
        return truck;
    }

    public Car getCar(){
        var car = new Car(5,"Nissan Kckics");
        return car;
    }

}
