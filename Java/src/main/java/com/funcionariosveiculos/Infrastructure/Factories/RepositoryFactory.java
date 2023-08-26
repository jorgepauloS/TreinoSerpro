package com.funcionariosveiculos.Infrastructure.Factories;

import com.funcionariosveiculos.Domain.Interfaces.*;
import com.funcionariosveiculos.Infrastructure.Repositories.FuncionarioSQLiteRepository;
import com.funcionariosveiculos.Infrastructure.Repositories.VeiculoRepository;

public class RepositoryFactory {

    public static IFuncionarioRepository funcionarioRepository;
    public static IVeiculoRepository veiculoRepository;

    public static IFuncionarioRepository GetFuncionarioRepository() {
        if (funcionarioRepository == null) {
            funcionarioRepository = new FuncionarioSQLiteRepository();
        }
        return funcionarioRepository;
    }

    public static IVeiculoRepository GetVeiculoRepository() {
        if (veiculoRepository == null) {
            veiculoRepository = new VeiculoRepository();
        }
        return veiculoRepository;
    }
}
