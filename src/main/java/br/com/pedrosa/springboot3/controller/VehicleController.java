package br.com.pedrosa.springboot3.controller;

import br.com.pedrosa.springboot3.dto.Car;
import br.com.pedrosa.springboot3.dto.Truck;
import br.com.pedrosa.springboot3.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(final VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @GetMapping("/car")
    public Car getCar(){
        return this.vehicleService.getCar();
    }
    @GetMapping("/truck")
    public Truck getTruck(){
        return this.vehicleService.getTruck();
    }

}
