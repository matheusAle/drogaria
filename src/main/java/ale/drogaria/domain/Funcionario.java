package ale.drogaria.domain;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tb_funcionario")
public class Funcionario extends GenericDomain{
    
    @Column(nullable = false)
    private String carteiraDeTrabalho;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataAdmissao;
    
    @OneToOne
    @JoinColumn(nullable = false)
    private Pessoa pessoa;


    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public Funcionario setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
        return this;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public Funcionario setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Funcionario setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }
}
