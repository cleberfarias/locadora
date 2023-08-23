package br.edu.senai.sc.locadora.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String modelo;
    private int ano;
    private String placa;
    private String cor;
    private Double preco;
    private String categoria;

    @OneToMany(mappedBy = "carro")
    private List<Emprestimo> emprestimos;

    public Carro(Long codigo,String modelo, int ano, String placa, String cor, Double preco, String categoria){
        this.codigo = codigo;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.preco = preco;
        this.categoria = categoria;


    }

    public Carro(){

    }

    // Getters e setters

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString(){
        return "Carro{"+ "codigo="+ codigo +"modelo= "+ modelo+ "ano ="+ ano+"placa= "+placa+"cor= "+ cor +"preço= "+preco+ "categoria= "+categoria;
    }

}



