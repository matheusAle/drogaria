package ale.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity()
public class Usuario extends GenericDomain{
    
    @Column(length = 32, nullable = false)
    private String senha;
    
    @Column(nullable = false)
    private Character tipo;
    
    @Column(nullable = false)
    private Boolean ativo;
    
    @OneToOne
    @JoinColumn(nullable = false)
    private Pessoa pessoa;

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public Character getTipo() {
        return tipo;
    }

    public Usuario setTipo(Character tipo) {
        this.tipo = tipo;
        return this;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Usuario setAtivo(Boolean ativo) {
        this.ativo = ativo;
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Usuario setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }
}
