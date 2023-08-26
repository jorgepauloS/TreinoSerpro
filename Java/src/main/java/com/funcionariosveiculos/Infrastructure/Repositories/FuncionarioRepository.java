package com.funcionariosveiculos.Infrastructure.Repositories;

import java.util.ArrayList;
import java.util.List;

import com.funcionariosveiculos.Domain.Interfaces.IFuncionarioRepository;
import com.funcionariosveiculos.Domain.Models.Funcionario;

public class FuncionarioRepository implements IFuncionarioRepository {

    List<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public List<Funcionario> GetFuncionarios() {
        return funcionarios;
    }

    @Override
    public Funcionario GetFuncionario(Integer id) {
        for(Funcionario func : funcionarios) {
            if (func.Id.equals(id)) {
                return func;
            }
        }

        return null;
    }

    @Override
    public void CreateFuncionario(Funcionario funcionario) {
        funcionario.Id = funcionarios.size() + 1;
        funcionarios.add(funcionario);
    }

    @Override
    public void UpdateFuncionario(Funcionario funcionario) {
        for(Funcionario func : funcionarios) {
            if (func.Id.equals(funcionario.Id)) {
                func.Nome = funcionario.Nome;
            }
        }
    }

    @Override
    public void DeleteFuncionario(Integer id) {
        Funcionario funcionarioAux = GetFuncionario(id);
        if(funcionarioAux != null) {
            funcionarios.remove(funcionarioAux);
        }
    }
}