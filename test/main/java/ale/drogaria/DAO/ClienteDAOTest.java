package main.java.ale.drogaria.DAO;

import ale.drogaria.DAO.ClienteDAO;
import ale.drogaria.DAO.PessoaDAO;
import ale.drogaria.domain.Cliente;
import ale.drogaria.domain.Pessoa;
import org.junit.Test;

import java.util.Date;

public class ClienteDAOTest {

    @Test
    public void salvar() {
        Cliente cliente = new Cliente()
                .setPessoa(new PessoaDAO().buscar(1L))
                .setDataDoCadastro(new Date())
                .setLiberado(true);

        new ClienteDAO().salvar(cliente);
        System.out.println(cliente);

    }

    @Test
    public void listar() {
        new ClienteDAO()
                .listar()
                .forEach(System.out::println);
    }
}