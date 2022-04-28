package br.com.pedrosa.springboot3.service;

import br.com.pedrosa.springboot3.dto.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListClientService {

    public List<Client> getClients(){
        return List.of(new Client(1l,"Fabio"),new Client(2l,"Maria"));
    }
}
