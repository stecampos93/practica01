@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idCliente; // hibernate lo transforma id_cliente
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;     public Cliente() {
    }     public Cliente(String nombre, String apellido, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
}
