package com.funcionariosveiculos.Application.BusinessLogic;

import com.funcionariosveiculos.Application.Interfaces.IVeiculoBLL;
import com.funcionariosveiculos.Domain.Interfaces.IVeiculoRepository;
import com.funcionariosveiculos.Infrastructure.Factories.RepositoryFactory;

public class VeiculoBLL implements IVeiculoBLL {
    IVeiculoRepository veiculoRepository;

    public VeiculoBLL() {
        veiculoRepository = RepositoryFactory.GetVeiculoRepository();
    }
}
