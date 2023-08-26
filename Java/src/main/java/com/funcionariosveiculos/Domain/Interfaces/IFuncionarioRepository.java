package com.funcionariosveiculos.Domain.Interfaces;

import java.util.List;

import com.funcionariosveiculos.Domain.Models.Funcionario;

public interface IFuncionarioRepository {
    public List<Funcionario> GetFuncionarios();
    public Funcionario GetFuncionario(Integer id);
    public void CreateFuncionario(Funcionario funcionario);
    public void UpdateFuncionario(Funcionario funcionario);
    public void DeleteFuncionario(Integer id);
}
