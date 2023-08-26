package com.funcionariosveiculos.Domain.Models;

import java.sql.Date;

public class SaidaVeiculo {
    public Integer IdFuncionario;
    public Integer IdVeiculo;
    public Date DataHoraSaida;
    public Date DataHoraRetorno;
    public Double KmInicial;
    public Double KmFinal;

    public SaidaVeiculo(Integer idFuncionario, Integer idVeiculo) {
        this.IdFuncionario = idFuncionario;
        this.IdVeiculo = idVeiculo;
    }

    public void RegistrarSaida(Date dataHoraSaida, Double kmInicial) {
        this.DataHoraSaida = dataHoraSaida;
        this.KmInicial = kmInicial;
    }

    public void RegistrarRetorno(Date dataHoraRetorno, Double kmFinal) {
        this.DataHoraRetorno = dataHoraRetorno;
        this.KmFinal = kmFinal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("O funcionário com id " + this.IdFuncionario + " pegou o veículo com id " + this.IdVeiculo);

        if (this.DataHoraSaida != null) {
            sb.append("Veículo saiu às " + this.DataHoraSaida.toString() + " com " + this.KmInicial + "km rodados.\n");
        }

        if (this.DataHoraRetorno != null) {
            sb.append("Veículo retornou às " + this.DataHoraRetorno.toString() + " com " + this.KmFinal + "km rodados.\n");
        }

        return sb.toString();
    }
}