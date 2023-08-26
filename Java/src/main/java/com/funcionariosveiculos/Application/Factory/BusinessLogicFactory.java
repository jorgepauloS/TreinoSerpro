package com.funcionariosveiculos.Application.Factory;

import com.funcionariosveiculos.Application.BusinessLogic.*;
import com.funcionariosveiculos.Application.Interfaces.*;

public class BusinessLogicFactory {
    private static FuncionarioBLL funcionarioBLL;
    private static VeiculoBLL veiculoBLL;

    public static IFuncionarioBLL GetFuncionarioBLL() {
        if(funcionarioBLL == null) {
            funcionarioBLL = new FuncionarioBLL();
        }

        return funcionarioBLL;
    }

    public static IVeiculoBLL GetVeiculoBLL() {
        if(veiculoBLL == null) {
            veiculoBLL = new VeiculoBLL();
        }

        return veiculoBLL;
    }
}
