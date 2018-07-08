/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ale.drogaria.DAO;

import ale.drogaria.DAO.EstadoDAO;
import ale.drogaria.domain.Estado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author matheus
 */
public class EstadoDAOTest {
    
    public EstadoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void salvarTest() {
        Estado estado = new Estado();
        estado.setNome("Mato Grosso do Sul");
        estado.setSigla("MS");
        EstadoDAO estadoDAO = new EstadoDAO();
        estadoDAO.salvar(estado);
        System.out.println(estado);
    }

    @Test
    public void listarTest() {
        new EstadoDAO()
                .listar()
                .forEach(System.out::println);
    }

    @Test
    public void buscarTest() {
        System.out.println(new EstadoDAO().buscar(2L));
    }

    @Test
    public void deletarTest() {
        EstadoDAO estadoDAO = new EstadoDAO();
        Estado ms = estadoDAO.buscar(2L);

        if (ms != null) {
            estadoDAO.deletar(ms);
            System.out.println("Estado deletado.");
        } else {
            System.out.println("Estado não existe.");
        }

    }

    @Test
    public void editarTest() {
        EstadoDAO estadoDAO = new EstadoDAO();
        Estado ms = estadoDAO.buscar(2L);

        if (ms != null) {
            ms.setSigla("MS");
            estadoDAO.editar(ms);
        } else {
            System.out.println("Estado não existe.");
        }

    }
}
