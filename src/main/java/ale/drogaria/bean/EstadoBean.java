package ale.drogaria.bean;

import ale.drogaria.DAO.EstadoDAO;
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
public class EstadoBean implements Serializable {

    private Estado estado;
    private List<Estado> estados;

    @PostConstruct
    public void listar() {
        try {
            this.estados = new EstadoDAO().listar();
        } catch (Exception e) {
            Messages.addError("Erro ao listar os o sstados.", e.getMessage());
        }
    }

    public void novo() {
        this.estado = new Estado();
    }

    public void salvar() {
        try {
            new EstadoDAO().merge(this.getEstado());
            if (!this.estados.contains(this.estado)) {
                this.estados.add(this.getEstado());
                Messages.addGlobalInfo("Novo estado cadastrado.");
            } else {
                Messages.addGlobalInfo("O cadastro do estado foi atualizado.");
            }
            this.novo();
        } catch (Exception e) {
            Messages.addError("Erro ao salvar o estado.", e.getMessage());
        }
    }

    public void excluir(ActionEvent event) {
        Estado estado = (Estado) event.getComponent().getAttributes().get("estadoSelecionado");
        try {
            new EstadoDAO().deletar(estado);
            this.estados.remove(estado);
            Messages.addGlobalInfo("O estado foi deletado com sucesso");
        } catch (Exception e) {
            Messages.addGlobalError("Erro ao deletar o estado.", e.getMessage());
        }
    }

    public void editar(ActionEvent event) {
        this.estado = (Estado) event.getComponent().getAttributes().get("estadoSelecionado");
    }


    public Estado getEstado() {
        return estado;
    }

    public EstadoBean setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public EstadoBean setEstados(List<Estado> estados) {
        this.estados = estados;
        return this;
    }
}
