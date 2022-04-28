package br.com.pedrosa.springboot3.controller;

import br.com.pedrosa.springboot3.dto.Client;
import br.com.pedrosa.springboot3.service.ListClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ListClientService listClientService;

    public ClientController(ListClientService listClientService){
        this.listClientService = listClientService;
    }

    @GetMapping
    public List<Client> getClients(){
        return listClientService.getClients();
    }
}
