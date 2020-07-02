const database = require('../config/db');

class Usuario {

    list() {
        const sql = 'SELECT * FROM usuarioAula';
        return database.query(sql);
    }

    create(nome, email, senha){
        const sql = `INSERT INTO usuarioAula(nome, email, senha) 
        VALUES ('${nome}','${email}','${senha}')`;
        database.query(sql);

    }

    find(nome){
        const sql = `SELECT * FROM usuarioAula WHERE nome = '${nome}'`;
        return database.query(sql);
    }

    change(senha, id){
        const sql = `UPDATE usuarioAula SET senha='${senha}' Where id='${id}'`;
        return database.query(sql);
    }


}

module.exports = Usuario;