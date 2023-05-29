package br.com.pedrosa.springboot3.repository;

import br.com.pedrosa.springboot3.entities.Cliente;
import org.springframework.data.repository.ListCrudRepository;

public interface ClienteRepository extends ListCrudRepository<Cliente, Long> {
}
