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
public class ItemVenda extends GenericDomain {
    
    @Column( nullable = false)
    private Short auantidade;
  
    @Column(nullable = false)
    private BigDecimal subtotal;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Venda venda;

    public Short getAuantidade() {
        return auantidade;
    }

    public ItemVenda setAuantidade(Short auantidade) {
        this.auantidade = auantidade;
        return this;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public ItemVenda setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public Produto getProduto() {
        return produto;
    }

    public ItemVenda setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }

    public Venda getVenda() {
        return venda;
    }

    public ItemVenda setVenda(Venda venda) {
        this.venda = venda;
        return this;
    }
}
