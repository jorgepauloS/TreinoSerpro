package com.funcionariosveiculos.Application.Interfaces;

import java.util.List;

import com.funcionariosveiculos.Domain.Models.Funcionario;

public interface IFuncionarioBLL {
    public List<Funcionario> GetFuncionarios();
    public Funcionario GetFuncionario(Integer id);
    public void CreateFuncionario(Funcionario funcionario);
    public void UpdateFuncionario(Funcionario funcionario);
    public void DeleteFuncionario(Integer id);
}
