package com.funcionariosveiculos.Domain.Interfaces;

import java.util.List;

import com.funcionariosveiculos.Domain.Models.Veiculo;

public interface IVeiculoRepository {
    public List<Veiculo> GetVeiculos();
    public List<Veiculo> GetVeiculosDisponiveis();
    public Veiculo GetVeiculo(Integer id);
    public void CreateVeiculo(Veiculo veiculo);
    public void UpdateVeiculo(Veiculo veiculo);
    public void DeleteVeiculo(Integer id);

    public void SaidaVeiculo(Integer idVeiculo, Integer idFuncionario, double kmAtual);
    public void RetornoVeiculo(Integer idVeiculo, Integer idFuncionario, double kmAtual);
}
