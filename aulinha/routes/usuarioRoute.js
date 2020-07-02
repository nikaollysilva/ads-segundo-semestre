const express = require('express');
const router = express.Router();

const UsuarioController = require('../controller/usuarioController');

router.get('/usuario', function(request, response){
    UsuarioController.list(request, response);
});

router.post('/usuario', function(request, response){
    UsuarioController.create(request, response);
})

router.get('/usuario/:name', function(request, response){
    UsuarioController.find(request, response);
})

router.put('/usuario', function(request, response){
    UsuarioController.change(request, response);
})

module.exports = router;