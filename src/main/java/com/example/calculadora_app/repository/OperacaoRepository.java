package com.example.calculadora_app.repository;

import com.example.calculadora_app.model.Operacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, Long> {
}
