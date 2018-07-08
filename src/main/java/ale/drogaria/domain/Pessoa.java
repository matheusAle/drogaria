package ale.drogaria.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity()
public class Pessoa extends GenericDomain {
    
    @Column(length = 80, nullable = false)
    private String nome;

    @Column(length = 15, nullable = false)
    private String cpf;

    @Column()
    private String rua;

    @Column()
    private Short numero;
    
    @Column()
    private String bairro;

    @Column()
    private String cep;

    @Column()
    private String complemento;

    @Column(length = 12)
    private String telefone;
    
    @Column(length = 12)
    private String celular;

    @Column(length = 100)
    private String email;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Cidade cidade;

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Pessoa setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getRua() {
        return rua;
    }

    public Pessoa setRua(String rua) {
        this.rua = rua;
        return this;
    }

    public Short getNumero() {
        return numero;
    }

    public Pessoa setNumero(Short numero) {
        this.numero = numero;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public Pessoa setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Pessoa setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public Pessoa setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Pessoa setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getCelular() {
        return celular;
    }

    public Pessoa setCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Pessoa setEmail(String email) {
        this.email = email;
        return this;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Pessoa setCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", complemento='" + complemento + '\'' +
                ", telefone='" + telefone + '\'' +
                ", celular='" + celular + '\'' +
                ", email='" + email + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
