package com.funcionariosveiculos.Domain.Models;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Funcionario {

    public Integer Id;
    public String Nome;
    public LocalDateTime DataCadastro;

    public Funcionario(String nome) {
        this.Id = 0;
        this.Nome = nome;
        this.DataCadastro = ZonedDateTime.now().toLocalDateTime();;
    }

    public Funcionario(Integer id, String nome, LocalDateTime dataCadastro) {
        this.Id = id;
        this.Nome = nome;
        this.DataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Funcionário - " + Id + " - " + Nome;
    }
}
