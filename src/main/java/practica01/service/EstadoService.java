package practica01.service;
import practica01.domain.Estado;
import java.util.List;

public interface EstadoService {
public List<Estado> getEstados();
public Estado getEstado(Estado estado);
public void save(Estado estado); // Para insertar o modificar (si viene el idCliente o no)
public void delete(Estado estado);
}
