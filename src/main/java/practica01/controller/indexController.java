
package practica01.controller;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import practica01.dao.ClienteDao;
import practica01.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
@Sfl4j
@Controller


public class indexController {
    @Autowired
    ClienteService clienteService;
    @GetMapping("/")
    public String inicio(Model model) {
       log.info("Ahora desde MVC");
                var clientes = clienteService .getClientes();
                model.addAttribute("clientes", clientes);
        return "index";
    }
    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente){
        return "modificarCliente";
    }
    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente){
        clienteService.save(cliente);
        return "redirect:/";
    }
    @GetMapping("moficarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model){
    cliente = clienteService.getCliente(cliente);
            model.addAttribute("Cliente", cliente);
            return "modificarCliente";     }
    @GetMapping("eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente){
     clienteService.delete(cliente);
            return "redirect";
    }
}
