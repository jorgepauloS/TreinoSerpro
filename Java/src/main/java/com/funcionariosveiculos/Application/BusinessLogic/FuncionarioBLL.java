package com.funcionariosveiculos.Application.BusinessLogic;

import java.util.List;

import com.funcionariosveiculos.Application.Interfaces.IFuncionarioBLL;
import com.funcionariosveiculos.Domain.Interfaces.IFuncionarioRepository;
import com.funcionariosveiculos.Domain.Models.Funcionario;
import com.funcionariosveiculos.Infrastructure.Factories.RepositoryFactory;

public class FuncionarioBLL implements IFuncionarioBLL {

    IFuncionarioRepository funcionarioRepository;

    public FuncionarioBLL() {
        funcionarioRepository = RepositoryFactory.GetFuncionarioRepository();
    }

    @Override
    public List<Funcionario> GetFuncionarios() {
        return funcionarioRepository.GetFuncionarios();
    }

    @Override
    public Funcionario GetFuncionario(Integer id) {
        return funcionarioRepository.GetFuncionario(id);
    }

    @Override
    public void CreateFuncionario(Funcionario funcionario) {
        funcionarioRepository.CreateFuncionario(funcionario);
    }

    @Override
    public void UpdateFuncionario(Funcionario funcionario) {
        funcionarioRepository.UpdateFuncionario(funcionario);
    }

    @Override
    public void DeleteFuncionario(Integer id) {
        funcionarioRepository.DeleteFuncionario(id);
    }
    
}
