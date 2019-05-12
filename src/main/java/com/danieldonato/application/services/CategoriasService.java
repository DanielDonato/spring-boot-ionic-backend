package com.danieldonato.application.services;

import com.danieldonato.application.domain.Categoria;
import com.danieldonato.application.repositories.CategoriasRepository;
import com.danieldonato.application.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriasService {

    @Autowired
    private CategoriasRepository repo;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id = " + id));
    }

}
