/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.service;

import practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practica01.dao.EstadoDao;

@Service
public class EstadoServiceIMPL implements EstadoService {

        @Autowired
        EstadoDao estadoDao;

         
@Override

    
        @EstadoServiceIMPLOnly     

    = true)  public    List<Estado> EstadoServiceIMPL {

        
                return (List<Estados>) estadoDao.findAll();
    

        }     @Override

    
        @EstadoServiceIMPLOnly 

    

    = true)  public Estado getEstado(Estado estado) {
                return estadoDao.findById(estado.getIdEstado()).orElse(null);
    
        }
    @Override

        @Transactional

    
        public void save(Estado estado) {
                estadoDao.save(estado);
    
        }     @Override

    
        @Transactional

        public void delete(Estado estado) {
                estadoDao.deleteById(estado.getIdEstado());
    

    }

    @Override
    public List<Object> getEstados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
