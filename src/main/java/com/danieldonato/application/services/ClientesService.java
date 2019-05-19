package com.danieldonato.application.services;

import com.danieldonato.application.domain.Categoria;
import com.danieldonato.application.domain.Cliente;
import com.danieldonato.application.repositories.CategoriasRepository;
import com.danieldonato.application.repositories.ClienteRepository;
import com.danieldonato.application.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientesService {

    @Autowired
    private ClienteRepository repo;

    public Cliente findById(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id = " + id));
    }

}
