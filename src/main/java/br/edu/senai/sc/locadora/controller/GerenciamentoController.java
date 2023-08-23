package br.edu.senai.sc.locadora.controller;

import br.edu.senai.sc.locadora.entity.Carro;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gerenciamento")
@Slf4j
public class GerenciamentoController {
    @GetMapping("/hello")

    public ResponseEntity<Carro> hellWorld(){
        Carro carro = new Carro();
        carro.setAno(2020);
        carro.setCor("Preto");
        carro.setModelo("Prisma");
        return new ResponseEntity<>(carro, HttpStatus.OK);
    }
    @PostMapping
    public String cadastrarCarro(@RequestBody Carro carro){


        return "Cadastrado com Sucesso!!";
    }
    @PutMapping("/alterar")

    public String alterarCarro(@RequestBody Carro carro, @RequestParam("codigo")int codigo){

        log.info("codigo é " + codigo);


        return "Carro Alterado com Sucesso!!";
    }
    @PatchMapping("/alterarPlaca/{codigo}")
    public String alterarPlaca(@RequestBody Carro carro, @PathVariable("codigo")int codigo){
        return "Placa Alterada Com Sucesso!!";

    }
    @DeleteMapping("/excluir/{codigo}")
    public String excluirCarro(@PathVariable("codigo")int codigo){
        return "Carro Excluido com suscesso!!";
    }
    @GetMapping("/consultar/{codigo}")
    public Carro consultaCarro(@PathVariable ("codigo")int codigo){
        Carro carro = new Carro();
        carro.setAno(2020);
        carro.setCor("Preto");
        carro.setModelo("Prisma");
        return carro;
    }

}
