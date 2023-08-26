module.exports = class Funcionario {
    constructor(nome, id = 0, dataCadastro = Date.now()) {
        this.nome = nome;
        this.id = id;
        this.dataCadastro = dataCadastro;
    }
}