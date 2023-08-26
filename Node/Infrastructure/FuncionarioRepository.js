const Funcionario = require('../Domain/Funcionario');
const sqlite3 = require('sqlite3').verbose();

module.exports = class FuncionarioRepository {
    GetAll() {
        let funcionarios = [];    
        let db = GetDb();

        db.all('SELECT Id, Nome, DataCadastro FROM Funcionarios', (erro, linhas) => {
            for(let i in linhas) {
                funcionarios.push(new Funcionario(linhas[i].Nome, linhas[i].Id, linhas[i].dataCadastro));
            }
        });        
        
        return funcionarios;
    }   
}

function GetDb() {
    return new sqlite3.Database('/Users/jorgepaulo/Documents/Códigos/Serpro/TreinoSerpro/Base/mydb.db');
}