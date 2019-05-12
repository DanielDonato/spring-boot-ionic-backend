package com.danieldonato.application.repositories;

import com.danieldonato.application.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
}
