const test = require('tape');
const Funcionario = require('./Domain/Funcionario');

test('Instância de funcionário', (test) => {
    let funcionario = new Funcionario('Jorge');
    test.assert(funcionario.id === 0, "Criou corretamente");
    test.end();
})