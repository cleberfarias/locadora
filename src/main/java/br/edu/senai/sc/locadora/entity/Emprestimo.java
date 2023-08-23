package br.edu.senai.sc.locadora.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

import javax.persistence.*;
import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity

public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long codigo;

    private LocalDateTime inicio;

    private LocalDateTime termino;

    private String locatario;

    private String cpf;

    private Double pagamento;
    private Double taxa;
    private LocalDateTime devolucao;
    @ManyToOne
    @JoinColumn(name = "carro")
    private Carro carro;

}


