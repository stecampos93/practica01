/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.dao;
import practica01.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Stiphen Campos
 */
public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
}
