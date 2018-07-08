package main.java.ale.drogaria.DAO;

import ale.drogaria.DAO.CidadeDAO;
import ale.drogaria.DAO.EstadoDAO;
import ale.drogaria.domain.Cidade;
import org.junit.Test;

public class CidadeDAOTest {

    @Test
    public void salvar() {
        Cidade cidade = new Cidade();
        cidade.setNome("navirai");
        cidade.setEstado(new EstadoDAO().buscar(2L));
        new CidadeDAO().salvar(cidade);
        System.out.println(cidade);
    }

    @Test
    public void listar() {
        new CidadeDAO()
                .listar()
                .forEach(System.out::println);
    }

    @Test
    public void buscar() {
        System.out.println(new CidadeDAO().buscar(1L));
    }

    @Test
    public void deletar() {
    }

    @Test
    public void editar() {
    }
}