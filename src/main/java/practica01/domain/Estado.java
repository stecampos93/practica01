package practica01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author XPC
 */
@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idEstado; // hibernate lo transforma id_cliente
    private String nombreEstado;
    private String nombreCapital;
    private Integer numPoblacion;
    private Integer numProvincias;

    public Estado() {

    }

    public Estado(String nombreEstado, String nombreCapital, Integer numPoblacion, Integer numProvincias) {

        this.nombreEstado = nombreEstado;
        this.nombreCapital = nombreCapital;
        this.numPoblacion = numPoblacion;
        this.numProvincias = numProvincias;

    }
}
