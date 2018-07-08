package main.java.ale.drogaria.DAO;

import ale.drogaria.DAO.PessoaDAO;
import ale.drogaria.DAO.CidadeDAO;
import ale.drogaria.domain.Pessoa;
import org.junit.Test;

public class PessoaDAOTest {

    @Test
    public void salvar() {
        Pessoa pessoa = new Pessoa()
                .setNome("Matheus Ale da Silva")
                .setEmail("m.matheus.main.java.ale@gmail.com")
                .setTelefone("67992404040")
                .setCpf("12312312345")
                .setCidade(new CidadeDAO().buscar(2L));
        new PessoaDAO().salvar(pessoa);
        System.out.println(pessoa);
    }

    @Test
    public void listar() {
        new PessoaDAO()
                .listar()
                .forEach(System.out::println);
    }
}