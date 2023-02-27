package practica01.controller;

import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import practica01.domain.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import practica01.dao.EstadoDao;
import practica01.service.EstadoService;

@Slf4j
@Controller

public class indexController {

    @Autowired
    EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora desde MVC");
        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);
        return "index";

    }

    @GetMapping(
            "/nuevoEstado")
    public String nuevoEstado(Estado estado) {
        return "modificarEstado";

    }

    @PostMapping(
            "/guardarEstado")
    public String guardarEstado(Estado estado) {
        estadoService.save(estado);
        return "redirect:/";

    }

    @GetMapping(
            "moficarEstado/{idEstado}")
    public String modificarEstado(Estado estado, Model model) {
        estado = estadoService.getEstado(estado);
        model.addAttribute("Estado", estado);
        return "modificarEstado";

    }

    @GetMapping(
            "eliminarEstado/{idEstado}")
    public String eliminarEstado(Estado estado) {
        estadoService.delete(estado);
        return "redirect";

    }
}
