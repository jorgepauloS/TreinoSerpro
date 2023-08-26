package com.funcionariosveiculos.Domain.Models;

public class Veiculo {
    public Integer Id;
    public String Placa;
    public String Marca;
    public String Modelo;
    public Double KmAtual;
    public Boolean Disponivel;

    public Veiculo(String placa, String marca, String modelo, Double kmAtual) {
        this.Placa = placa;
        this.Marca = marca;
        this.Modelo = modelo;
        this.KmAtual = kmAtual;
        this.Disponivel = true;
    }

    public Veiculo(Integer id, String placa, String marca, String modelo, Double kmAtual, Boolean disponivel) {
        this.Id = id;
        this.Placa = placa;
        this.Marca = marca;
        this.Modelo = modelo;
        this.KmAtual = kmAtual;
        this.Disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Veículo: Placa - " + this.Placa + " - " + (this.Disponivel ? "Disponível" : "Indisponível");
    }
}
