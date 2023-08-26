package com.funcionariosveiculos.Infrastructure.Repositories;

import java.util.ArrayList;
import java.util.List;

import com.funcionariosveiculos.Domain.Interfaces.IVeiculoRepository;
import com.funcionariosveiculos.Domain.Models.Veiculo;

public class VeiculoRepository implements IVeiculoRepository {

    List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public List<Veiculo> GetVeiculos() {
        return veiculos;
    }

    @Override
    public List<Veiculo> GetVeiculosDisponiveis() {
        List<Veiculo> veiculosAux = new ArrayList<>();

        for(Veiculo veic : veiculos) {
            if (veic.Disponivel) {
                veiculosAux.add(veic);
            }
        }

        return veiculosAux;
    }

    @Override
    public Veiculo GetVeiculo(Integer id) {
        for(Veiculo veic : veiculos) {
            if (veic.Id.equals(id)) {
                return veic;
            }
        }

        return null;
    }

    @Override
    public void CreateVeiculo(Veiculo veiculo) {
        veiculo.Id = veiculos.size() + 1;
        veiculo.Disponivel = true;
        veiculos.add(veiculo);
    }

    @Override
    public void UpdateVeiculo(Veiculo veiculo) {
        for(Veiculo veic : veiculos) {
            if (veic.Id.equals(veiculo.Id)) {
                veic.Disponivel = veiculo.Disponivel;
                veic.KmAtual = veiculo.KmAtual;
                veic.Marca = veiculo.Marca;
                veic.Modelo = veiculo.Modelo;
                veic.Placa = veiculo.Placa;
            }
        }
    }

    @Override
    public void DeleteVeiculo(Integer id) {
        Veiculo veiculoAux = GetVeiculo(id);
        if(veiculoAux != null) {
            veiculos.remove(veiculoAux);
        }
    }

    @Override
    public void SaidaVeiculo(Integer idVeiculo, Integer idFuncionario, double kmAtual) {
        throw new UnsupportedOperationException("Unimplemented method 'SaidaVeiculo'");
    }

    @Override
    public void RetornoVeiculo(Integer idVeiculo, Integer idFuncionario, double kmAtual) {
        throw new UnsupportedOperationException("Unimplemented method 'RetornoVeiculo'");
    }
}
