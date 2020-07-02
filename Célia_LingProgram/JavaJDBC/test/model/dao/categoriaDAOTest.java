/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nikaolly
 */
public class categoriaDAOTest {
    
    public categoriaDAOTest() {
    }

    @Test
    public void tstSave() {
        Categoria cat = new Categoria("Roupas");
        categoriaDAO dao = new categoriaDAO();
        
        if(dao.save(cat)){
            System.out.println("Teste:Salvo com sucesso");
        }else{
            fail("Teste: Erro ao salvar");
        }
    }
    
}
