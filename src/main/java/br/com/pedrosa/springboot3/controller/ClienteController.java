package br.com.pedrosa.springboot3.controller;

import br.com.pedrosa.springboot3.dto.ClienteDTO;
import br.com.pedrosa.springboot3.entities.Cliente;
import br.com.pedrosa.springboot3.exception.EntityNotFoundException;
import br.com.pedrosa.springboot3.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public ClienteDTO save(@Valid @RequestBody ClienteDTO clienteDTO){
        var cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO,cliente);
        var clienteSalvo = clienteRepository.save(cliente);
        return new ClienteDTO(clienteSalvo.getId(),clienteSalvo.getNome());
    }

    @GetMapping
    public List<ClienteDTO> listAll(){
        return clienteRepository.findAll()
                .stream()
                .map(c -> new ClienteDTO(c.getId(),c.getNome()))
                .collect(Collectors.toList());
    }
    @GetMapping("{id}")
    public ClienteDTO getById(@PathVariable("id") Long id){
        return clienteRepository.findById(id)
                .map(c -> new ClienteDTO(c.getId(),c.getNome()))
                .orElseThrow(() -> new EntityNotFoundException("Cliente nao encontrado "+ id));
    }

}
