
package ale.drogaria.domain;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "tb_fabricante")
public class Fabricante extends GenericDomain {
      
    @Column(length = 50, nullable = false)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Fabricante setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
