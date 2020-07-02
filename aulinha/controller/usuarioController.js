const UsuarioModel = require('../models/usuario');

const list = async function (request, response) {
    const usuarioModel = new UsuarioModel();

    try {
        const result = await usuarioModel.list();
        response.status(200).send(result)
    } catch (error) {
        console.log(`Erro: ${error}`);
        response.status(500).send("Erro");
    }
}

const create = function(request, response){
    let {nome, senha, email} = request.body;

    const usuarioModel = new UsuarioModel();

    try{
        usuarioModel.create(nome, email, senha);
        response.status(201).send('Criado com sucesso')
    }catch(error){
        console.log(`Erro: ${error}`);
        response.status(500).send("Erro");
    }
}

const find = async function (request, response){
    let nome = request.params.name;
    // let {nome, idade} = request.params;

    const usuarioModel = new UsuarioModel();

    try{
       const result = await usuarioModel.find(nome);
       response.status(200).send(result);
    }catch(error){
        console.log(`Erro: ${error}`);
        response.status(500).send("Erro");
    }
}

const change = function(request, response){
    let {senha, id} = request.body;

    const usuarioModel = new UsuarioModel();

    try{
        usuarioModel.change(senha, id);
        response.status(200).send('Alterado com sucesso');
    }catch(error){
        console.log(`Erro: ${error}`);
        response.status(500).send("Erro"); 
    }
}

module.exports = {
    list,
    create,
    find,
    change
}