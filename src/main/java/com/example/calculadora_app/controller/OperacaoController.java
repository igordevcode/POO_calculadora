package com.example.calculadora_app.controller;

import com.example.calculadora_app.model.Operacao;
import com.example.calculadora_app.service.OperacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/calculadora")
@RequiredArgsConstructor
public class OperacaoController {
    private final OperacaoService service;

    public OperacaoController(OperacaoService service) {
        this.service = service;
    }

    @PostMapping("/soma")
    public ResponseEntity<Operacao> soma(@RequestParam Double numero1, @RequestParam Double numero2) {
        double resultado = numero1 + numero2;
        return ResponseEntity.ok(service.salvarOperacao("SOMA", numero1, numero2, resultado));
    }

    @PostMapping("/subtracao")
    public ResponseEntity<Operacao> subtracao(@RequestParam Double numero1, @RequestParam Double numero2) {
        double resultado = numero1 - numero2;
        return ResponseEntity.ok(service.salvarOperacao("SUBTRACAO", numero1, numero2, resultado));
    }

    @PostMapping("/multiplicacao")
    public ResponseEntity<Operacao> multiplicacao(@RequestParam Double numero1, @RequestParam Double numero2) {
        double resultado = numero1 * numero2;
        return ResponseEntity.ok(service.salvarOperacao("MULTIPLICACAO", numero1, numero2, resultado));
    }

    @PostMapping("/divisao")
    public ResponseEntity<Operacao> divisao(@RequestParam Double numero1, @RequestParam Double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        double resultado = numero1 / numero2;
        return ResponseEntity.ok(service.salvarOperacao("DIVISAO", numero1, numero2, resultado));
    }

    @GetMapping("/historico")
    public ResponseEntity<List<Operacao>> historico() {
        return ResponseEntity.ok(service.listarHistorico());
    }
}
