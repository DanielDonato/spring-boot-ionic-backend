package com.danieldonato.application.services;

import com.danieldonato.application.domain.Categoria;
import com.danieldonato.application.repositories.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriasService {

    @Autowired
    private CategoriasRepository repo;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
