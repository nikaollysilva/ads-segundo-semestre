const express = require('express');
const bodyParser = require('body-parser');

const server = express();
server.use(express.json());

server.use(bodyParser.json());
server.use(bodyParser.urlencoded({extended: true}));

server.use(require('./routes/usuarioRoute'));

server.get('/', function(request, response){
    console.log('Servidor rodando rodando na porta 3333');
})

server.listen(3333);