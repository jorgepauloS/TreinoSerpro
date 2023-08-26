package com.funcionariosveiculos.Infrastructure.Repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.funcionariosveiculos.Domain.Interfaces.IFuncionarioRepository;
import com.funcionariosveiculos.Domain.Models.Funcionario;

public class FuncionarioSQLiteRepository implements IFuncionarioRepository {

    public FuncionarioSQLiteRepository() {
        com.funcionariosveiculos.Infrastructure.SQLite.Structure.EnsureDatabaseStructureCreated();
    }
    
    @Override
    public List<Funcionario> GetFuncionarios() {
        try {
            Statement statement = com.funcionariosveiculos.Infrastructure.SQLite.Structure.GetStatement();
            ResultSet rs = statement.executeQuery("select * from Funcionarios");

            List<Funcionario> funcionarios = new ArrayList<>();
            while(rs.next()) {
                funcionarios.add(new Funcionario(rs.getInt("Id"),
                rs.getString("Nome"),
                LocalDateTime.parse(rs.getString("DataCadastro"))));
            }

            return funcionarios;
        }
        catch(SQLException ex) {
            return null;
        }
    }

    @Override
    public Funcionario GetFuncionario(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'GetFuncionario'");
    }

    @Override
    public void CreateFuncionario(Funcionario funcionario) {
        try {
            Statement statement = com.funcionariosveiculos.Infrastructure.SQLite.Structure.GetStatement();
            
            
            statement.executeUpdate("insert into Funcionarios (Nome, DataCadastro) values ('" + funcionario.Nome + "', '" + funcionario.DataCadastro.toString() + "')");
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void UpdateFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Unimplemented method 'UpdateFuncionario'");
    }

    @Override
    public void DeleteFuncionario(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'DeleteFuncionario'");
    }

}
