const FuncionarioRepository = require('../Infrastructure/FuncionarioRepository');

module.exports = class FuncionarioService {
    GetAll() {
        return new FuncionarioRepository().GetAll();
    }
}
