package br.com.pedrosa.springboot3.repository;

import br.com.pedrosa.springboot3.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Iterable<Customer> findByName(String name);
}
