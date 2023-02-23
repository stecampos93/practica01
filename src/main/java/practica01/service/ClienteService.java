
package practica01.service;
import practica01.domain.Cliente;
import java.util.List;

public interface ClienteService {
    public List<Cliente> getClientes();
    public Cliente getCliente(Cliente cliente);
    public void save(Cliente cliente); // Para insertar o modificar (si viene el idCliente o no)
    public void delete(Cliente cliente);
}
