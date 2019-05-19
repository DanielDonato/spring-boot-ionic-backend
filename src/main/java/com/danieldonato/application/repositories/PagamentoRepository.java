package com.danieldonato.application.repositories;

import com.danieldonato.application.domain.Estado;
import com.danieldonato.application.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
