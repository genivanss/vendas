package io.github.genivanss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.genivanss.model.Cliente;
import io.github.genivanss.repository.ClientesRepository;

@Service
public class ClientesService {

    //@Autowired //injeção de dependência opção 01
    private ClientesRepository repository;

    //@Autowired //injeção de dependência opção 02
    /*public void setRepository(ClientesRepository repository) {
        this.repository = repository;
    }*/

    @Autowired //injeção de dependência opção 03
    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persitir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //acessa a base e persiste o cliente
    }
    
}
