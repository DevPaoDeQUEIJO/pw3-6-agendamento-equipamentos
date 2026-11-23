package br.com.etec.rafaelmn_eduardo.equipamento.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class ReservaArmario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numeroArmario")
    private Integer nmrArmario;

    @Column(name = "nomeAluno")
    private String nmAluno;

    @Column(name = "dataInicio")
    private LocalDate dtInicio;

    @Column(name = "dataFim")
    private LocalDate dtFim;

    @Column(name = "ativo")
    private Boolean atv = true;
}
