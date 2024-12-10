package com.example.calculadora_app.service;

import com.example.calculadora_app.model.Operacao;
import com.example.calculadora_app.repository.OperacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OperacaoService {
    private final OperacaoRepository repository;

    public OperacaoService(OperacaoRepository repository) {
        this.repository = repository;
    }

    public Operacao salvarOperacao(String tipo, Double numero1, Double numero2, Double resultado) {
        Operacao operacao = new Operacao(null, tipo, numero1, numero2, resultado, LocalDateTime.now());
        return repository.save(operacao);
    }

    public List<Operacao> listarHistorico() {
        return repository.findAll();
    }
}
