package main.java.ale.drogaria.DAO;

import ale.drogaria.DAO.FabricanteDAO;
import ale.drogaria.domain.Fabricante;
import ale.drogaria.domain.Fabricante;
import org.junit.Test;


public class FabricanteDAOTest {

    @Test
    public void salvar() {
        Fabricante fabricante = new Fabricante()
                .setDescricao("Cosmed");

        new FabricanteDAO().salvar(fabricante);
        System.out.println(fabricante);
    }

    @Test
    public void listar() {
        new FabricanteDAO()
                .listar()
                .forEach(System.out::println);
    }

    @Test
    public void merge() {
        Fabricante fabricante = new Fabricante()
                .setDescricao("Fabrincate X");

        new FabricanteDAO().merge(fabricante);
        System.out.println(fabricante);
    }
}