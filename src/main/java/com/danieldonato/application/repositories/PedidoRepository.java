package com.danieldonato.application.repositories;

import com.danieldonato.application.domain.Categoria;
import com.danieldonato.application.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
