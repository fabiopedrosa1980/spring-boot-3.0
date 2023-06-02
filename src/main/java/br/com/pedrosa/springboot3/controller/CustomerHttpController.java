package br.com.pedrosa.springboot3.controller;

import br.com.pedrosa.springboot3.entities.Customer;
import br.com.pedrosa.springboot3.repository.CustomerRepository;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
class CustomerHttpController {

    private final CustomerRepository repository;
    private final ObservationRegistry registry;

    CustomerHttpController(CustomerRepository repository, ObservationRegistry registry) {
        this.repository = repository;
        this.registry = registry;
    }

    @GetMapping("/customers/{name}")
    Iterable<Customer> byName(@PathVariable String name) {
        Assert.state(Character.isUpperCase(name.charAt(0)), "the name must start with an uppercase letter");
        return Observation
                .createNotStarted("by-name", this.registry)
                .observe(() -> repository.findByName(name));
    }

    @GetMapping("/customers")
    Iterable<Customer> customers() {
        return this.repository.findAll();
    }
}
