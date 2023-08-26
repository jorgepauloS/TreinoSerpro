import sqlite3
from Python.Domain.Models.Funcionario import Funcionario

class FuncionarioRepository:
    
    def GetAll(self):
        funcionarios = []

        connection = self.GetConnection()
        for row in connection.execute('SELECT Id, Nome, DataCadastro FROM Funcionarios'):
            funcionarios.append(Funcionario(row[1], row[0], row[2]))
        
        return funcionarios

    def GetConnection(self):
        return sqlite3.connect('/Users/jorgepaulo/Documents/Códigos/Serpro/TreinoSerpro/Base/mydb.db')