package com.danieldonato.application.repositories;

import com.danieldonato.application.domain.Categoria;
import com.danieldonato.application.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadesRepository extends JpaRepository<Cidade, Integer> {
}
