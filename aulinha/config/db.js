const sql = require('mssql');
var config = {
    user: "userbandcare",
    password: "#Gfgrupo1b",
    server: "srvbandcare.database.windows.net",
    database: "bdbandcare",
    options:{
        encrypt: true
    }
}

const query = function(command){
    return new Promise(function(resolve, reject){
        sql.connect(config, function(error){
            if(error){
                throw error;
            }

            console.log('conectou!');
            const request = new sql.Request();
            request.query(command, function(error, result){
                if(error){
                    reject(error);
                }
                resolve(result);
            //  resolve(result.recordsets[0]);
            });
            sql.on('error', function(error){
                console.log(`Erro ao conectar com o banco de dados: ${error}`)
            })
        })
    })
}

module.exports = { query };