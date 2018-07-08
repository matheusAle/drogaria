/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ale.drogaria.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity()
public class Produto extends GenericDomain{
    
    @Column(nullable = false, length = 80 )
    private String descricao;
    
    @Column( nullable = false)
    private Short quantidade;
    
    @Column(precision = 6, scale =  2)
    private BigDecimal preco;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Fabricante fabricante;

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Short getQuantidade() {
        return quantidade;
    }

    public Produto setQuantidade(Short quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Produto setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", fabricante=" + fabricante +
                '}';
    }
}
