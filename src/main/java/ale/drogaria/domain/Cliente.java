package ale.drogaria.domain;

import javax.persistence.*;
import java.util.Date;

@Entity()
public class Cliente extends GenericDomain{
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataDoCadastro;
    
    @Column(nullable = false)
    private Boolean liberado;
    
    @OneToOne
    @JoinColumn(nullable = false)
    private Pessoa pessoa;


    public Date getDataDoCadastro() {
        return dataDoCadastro;
    }

    public Cliente setDataDoCadastro(Date dataDoCadastro) {
        this.dataDoCadastro = dataDoCadastro;
        return this;
    }

    public Boolean getLiberado() {
        return liberado;
    }

    public Cliente setLiberado(Boolean liberado) {
        this.liberado = liberado;
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Cliente setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataDoCadastro=" + dataDoCadastro +
                ", liberado=" + liberado +
                ", pessoa=" + pessoa +
                '}';
    }
}
