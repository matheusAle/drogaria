package ale.drogaria.bean;

import ale.drogaria.DAO.CidadeDAO;
import ale.drogaria.DAO.EstadoDAO;
import ale.drogaria.domain.Cidade;
import ale.drogaria.domain.Estado;
import org.omnifaces.util.Messages;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class CidadeBean implements Serializable {

    private Cidade cidade;
    private List<Cidade> cidades;
    private List<Estado> estados;

    @PostConstruct
    public void listar() {
        this.cidades = new CidadeDAO().listar();
    }

    public CidadeBean() {
        this.cidade = new Cidade();
    }

    public void nova() {
        try {
            if (this.estados == null) {
                this.estados = new EstadoDAO().listar();
            }
        } catch (Exception e) {
            Messages.addError("Erro ao criar uma nova cidade.", e.getMessage());
        }

    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public void salvar() {
        System.out.println(this.cidade);
        try {
            new CidadeDAO().merge(this.getCidade());
            if (!this.getCidades().contains(this.getCidade())) {
                this.getCidades().add(this.getCidade());
                Messages.addGlobalInfo("Nova cidade cadastrada.");
            } else {
                Messages.addGlobalInfo("O cadastro da cidade foi atualizado.");
            }
            this.cidade = new Cidade();
        } catch (Exception e) {
            Messages.addError("Erro ao salvar a cidade.", e.getMessage());
            e.printStackTrace();
        }
    }

    public void excluir(ActionEvent event) {
        Cidade cidade = (Cidade) event.getComponent().getAttributes().get("cidadeSelecionada");
        try {
            new CidadeDAO().deletar(cidade);
            this.getCidades().remove(cidade);
            Messages.addGlobalInfo("A cidade foi deletada com sucesso.");
        } catch (Exception e) {
            Messages.addGlobalError("Erro ao deletar a cidade.", e.getMessage());
        }
    }

    public void editar(ActionEvent event) {
        this.setCidade((Cidade) event.getComponent().getAttributes().get("cidadeSelecionada"));
    }
    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
