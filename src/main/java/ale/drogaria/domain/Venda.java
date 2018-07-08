package ale.drogaria.domain;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity()
public class Venda extends GenericDomain{
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horario;
    
    @Column( precision = 7, scale = 2)
    private BigDecimal valorTotal;
    
    @ManyToOne
    @JoinColumn()
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Funcionario functionario;

    public Date getHorario() {
        return horario;
    }

    public Venda setHorario(Date horario) {
        this.horario = horario;
        return this;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public Venda setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
        return this;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Venda setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public Funcionario getFunctionario() {
        return functionario;
    }

    public Venda setFunctionario(Funcionario functionario) {
        this.functionario = functionario;
        return this;
    }
}
