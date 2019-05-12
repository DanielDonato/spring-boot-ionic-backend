package com.danieldonato.application.repositories;

import com.danieldonato.application.domain.Cidade;
import com.danieldonato.application.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
