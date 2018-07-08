package main.java.ale.drogaria.DAO;

import ale.drogaria.DAO.PessoaDAO;
import ale.drogaria.domain.Usuario;
import org.junit.Test;

public class UsuarioDAOTest {

    @Test
    public void salvar() {
        Usuario usuario = new Usuario()
                .setPessoa(new PessoaDAO().buscar(1L))
                .setAtivo(true)
                .setTipo('B')
                .setSenha("123");
    }

    @Test
    public void listar() {
    }
}