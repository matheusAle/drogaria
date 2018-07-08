
package ale.drogaria.domain;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class GenericDomain implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    public long getCodigo() {
        return codigo;
    }

    public GenericDomain setCodigo(long codigo) {
        this.codigo = codigo;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s[codigo=%d]", getClass().getSimpleName(), this.getCodigo());
    }
}
