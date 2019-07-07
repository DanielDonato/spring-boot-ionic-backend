package com.danieldonato.application.services;

import com.danieldonato.application.domain.Pedido;
import com.danieldonato.application.repositories.PedidoRepository;
import com.danieldonato.application.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido findById(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id = " + id));
    }

}
