/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.service;

import practica01.dao.ClienteDao;
import practica01.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceIMPL implements ClienteService {

        @Autowired
        ClienteDao clienteDao;

         
@Override

    
        @Transactional(readOnly     

    = true)
    public    List<Cliente  > getClientes() {

        
                return (List<Cliente>) clienteDao.findAll();
    

        }     @Override

    
        @Transactional(readOnly 

    

    = true)
    public Cliente getCliente(Cliente cliente) {
                return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    
        }
    @Override

        @Transactional

    
        public void save(Cliente cliente) {
                clienteDao.save(cliente);
    
        }     @Override

    
        @Transactional

        public void delete(Cliente cliente) {
                clienteDao.deleteById(cliente.getIdCliente());
    

    }
}
