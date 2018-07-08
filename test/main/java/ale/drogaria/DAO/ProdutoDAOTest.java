package main.java.ale.drogaria.DAO;

import ale.drogaria.DAO.ProdutoDAO;
import ale.drogaria.DAO.FabricanteDAO;
import ale.drogaria.domain.Produto;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoDAOTest {

    @Test
    public void salvar() {
        Produto produto = new Produto()
                .setDescricao("Dipirona")
                .setPreco(new BigDecimal(20.99))
                .setFabricante(new FabricanteDAO().buscar(1L))
                .setQuantidade(new Short("254"));

        new ProdutoDAO().salvar(produto);
        System.out.println(produto);
    }

    @Test
    public void listar() {
        new ProdutoDAO()
                .listar()
                .forEach(System.out::println);
    }
}