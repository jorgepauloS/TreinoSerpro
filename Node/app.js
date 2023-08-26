// Requiring module
const express = require('express');
const FuncionarioService = require('./Application/FuncionarioService');
 
// Creating express object
const app = express();
 
// Handling GET request
app.get('/', (req, res) => {

    let funcionarios = new FuncionarioService().GetAll();

    setTimeout(function () {
        res.send(funcionarios);
        res.end()        
    }, 5000)
})
 
// Port Number
const PORT = process.env.PORT || 9000;
 
// Server Setup
app.listen(PORT,console.log(
  `Server started on port ${PORT}`));