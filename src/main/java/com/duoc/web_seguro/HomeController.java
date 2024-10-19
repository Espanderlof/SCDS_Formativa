package com.duoc.web_seguro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Comparator;

@Controller
public class HomeController {
    private final RecetaService recetaService;
    private List<String> bannersComerciales;

    public HomeController(RecetaService recetaService) {
        this.recetaService = recetaService;
        
        bannersComerciales = List.of(
            "¡50% de descuento en electrodomésticos de cocina!",
            "Nuevo libro de cocina: 'Sabores del Mundo' - ¡ya disponible!",
            "¡Suscríbete a nuestro canal de cocina para recetas semanales!"
        );
    }

    @GetMapping({"/", "/home"})
    public String home(@RequestParam(name="name", required=false, defaultValue="Seguridad y Calidad en el desarrollo") String name, Model model) {
        model.addAttribute("name", name);
        
        List<Receta> recetasOrdenadas = recetaService.obtenerTodasLasRecetas();
        recetasOrdenadas.sort(Comparator.comparing(Receta::getFechaCreacion).reversed());
        
        model.addAttribute("recetas", recetasOrdenadas);
        model.addAttribute("bannersComerciales", bannersComerciales);
        return "home";
    }
}