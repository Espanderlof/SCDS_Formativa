package com.duoc.web_seguro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class BusquedaController {

    private final RecetaService recetaService;

    public BusquedaController(RecetaService recetaService) {
        this.recetaService = recetaService;
    }

    @GetMapping("/buscar")
    public String buscar(@RequestParam(required = false) String nombre,
                         @RequestParam(required = false) String tipoCocina,
                         @RequestParam(required = false) String ingrediente,
                         @RequestParam(required = false) String paisOrigen,
                         @RequestParam(required = false) String dificultad,
                         Model model) {
        
        List<Receta> resultados = recetaService.buscarRecetas(nombre, tipoCocina, ingrediente, paisOrigen, dificultad);

        model.addAttribute("recetas", resultados);
        model.addAttribute("nombreBusqueda", nombre);
        model.addAttribute("tipoCocina", tipoCocina);
        model.addAttribute("ingrediente", ingrediente);
        model.addAttribute("paisOrigen", paisOrigen);
        model.addAttribute("dificultad", dificultad);
        return "buscar";
    }
}