package com.funcionariosveiculos.Infrastructure.SQLite;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Structure {

    public static Statement GetStatement() {
        try {
            String url = "jdbc:sqlite:/Users/jorgepaulo/Documents/Códigos/Serpro/TreinoSerpro/Base/mydb.db";
            Properties props = new Properties();
            Connection connection = org.sqlite.JDBC.createConnection(url, props);
            Statement statement =  connection.createStatement();
            statement.setQueryTimeout(30);
            return statement;
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public static void EnsureDatabaseStructureCreated() {
        try {
            Statement statement = GetStatement();
            statement.executeUpdate("drop table if exists Funcionarios");
            statement.executeUpdate("create table if not exists Funcionarios (Id integer PRIMARY KEY AUTOINCREMENT, Nome string, DataCadastro TEXT)");
            statement.executeUpdate("create table if not exists Veiculos (Id integer PRIMARY KEY AUTOINCREMENT, Placa string, Marca string, Modelo string, KmAtual real, Disponivel integer)");
            if(!statement.isClosed()) {
                statement.close();
            }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
    }
}
