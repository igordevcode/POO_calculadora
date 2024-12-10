package com.example.calculadora_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private Double numero1;
    private Double numero2;
    private Double resultado;
    private LocalDateTime dataHora;

    public Operacao(Object o, String tipo, Double numero1, Double numero2, Double resultado, LocalDateTime now) {
    }
}
