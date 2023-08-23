package br.edu.senai.sc.locadora.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emprestimo")

public class EmprestimoController {

    @PostMapping
    public void realizarEmprestimo(){

    }

    @GetMapping
    public void consultarTaxas(){

    }
    @PatchMapping
    public void realizarDevolucao(){

    }
    @GetMapping
    public void consultarEmprestimos(){

    }
}
