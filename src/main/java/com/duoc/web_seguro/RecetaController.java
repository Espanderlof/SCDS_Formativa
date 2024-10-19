package com.duoc.web_seguro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@Controller
public class RecetaController {

    private final RecetaService recetaService;

    public RecetaController(RecetaService recetaService) {
        this.recetaService = recetaService;
    }

    @GetMapping("/receta/{id}")
    public String detalleReceta(@PathVariable Long id, Model model) {
        Optional<Receta> receta = recetaService.obtenerRecetaPorId(id);
        if (receta.isPresent()) {
            model.addAttribute("receta", receta.get());
            return "detalleReceta";
        } else {
            return "redirect:/home";
        }
    }
}