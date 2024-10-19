package com.duoc.web_seguro;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

@Service
public class RecetaService {
    private List<Receta> recetas;

    public RecetaService() {
        recetas = new ArrayList<>();
        inicializarRecetas();
    }

    private void inicializarRecetas() {
        recetas.add(new Receta(1L, "Pasta Carbonara", "Un clásico plato italiano de pasta", "Italiana", 
            Arrays.asList("400g de pasta", "150g de panceta", "4 huevos", "100g de queso pecorino", "Pimienta negra"), 
            "Italia", "Media",
            "1. Cocina la pasta en agua con sal.\n2. Mientras tanto, fríe la panceta hasta que esté crujiente.\n3. En un bol, mezcla los huevos, el queso y pimienta.\n4. Escurre la pasta y mézclala con la panceta.\n5. Agrega la mezcla de huevos y revuelve rápidamente.\n6. Sirve inmediatamente con más queso por encima.", 
            20, "/img/carbonara.jpg"));
        recetas.add(new Receta(2L, "Pollo al Curry", "Un sabroso plato de curry indio", "India", 
            Arrays.asList("500g de pollo en trozos", "1 cebolla", "2 dientes de ajo", "1 lata de leche de coco", "2 cucharadas de curry en polvo", "Aceite", "Sal"), 
            "India", "Media",
            "1. Sofríe la cebolla y el ajo en aceite hasta que estén dorados.\n2. Agrega el pollo y dóralo por todos lados.\n3. Añade el curry en polvo y cocina por 1 minuto.\n4. Vierte la leche de coco y lleva a ebullición.\n5. Baja el fuego y cocina por 20 minutos o hasta que el pollo esté tierno.\n6. Ajusta la sal y sirve con arroz basmati.", 
            40, "/img/curry.jpg"));
            recetas.add(new Receta(3L, "Paella Valenciana", "Un plato tradicional español lleno de sabor", "Española", 
            Arrays.asList("300g de arroz", "200g de pollo", "100g de conejo", "100g de judías verdes", "100g de garrofó", "1 tomate", "Azafrán", "Romero", "Aceite de oliva", "Sal"),
            "España", "Difícil",
            "1. Sofríe el pollo y el conejo en una paella.\n2. Añade las verduras y sofríe.\n3. Agrega el arroz y el caldo, junto con el azafrán y el romero.\n4. Cocina a fuego medio-alto sin remover.\n5. Baja el fuego y cocina hasta que el arroz esté en su punto.\n6. Deja reposar antes de servir.", 
            45, "/img/paella.jpg"));
        
        recetas.add(new Receta(4L, "Sushi Roll California", "Un clásico del sushi occidental", "Japonesa", 
            Arrays.asList("Arroz de sushi", "Alga nori", "Pepino", "Aguacate", "Surimi", "Sésamo", "Vinagre de arroz", "Azúcar", "Sal"),
            "Japón", "Media",
            "1. Prepara el arroz de sushi con vinagre, azúcar y sal.\n2. Coloca el alga nori sobre una esterilla de bambú.\n3. Extiende una capa de arroz sobre el alga.\n4. Coloca tiras de pepino, aguacate y surimi en un extremo.\n5. Enrolla firmemente y sella el borde con agua.\n6. Corta en 6-8 piezas y espolvorea con sésamo.", 
            30, "/img/california_roll.jpg"));
        
        recetas.add(new Receta(5L, "Lasaña de Carne", "Un plato italiano reconfortante", "Italiana", 
            Arrays.asList("Láminas de lasaña", "500g de carne picada", "1 cebolla", "2 dientes de ajo", "800g de tomate triturado", "Bechamel", "Queso mozzarella", "Queso parmesano", "Aceite de oliva", "Sal", "Pimienta"),
            "Italia", "Media",
            "1. Prepara la salsa de carne con cebolla, ajo y tomate.\n2. Haz la bechamel.\n3. En una fuente, alterna capas de pasta, salsa de carne, bechamel y quesos.\n4. Termina con una capa de bechamel y queso parmesano.\n5. Hornea a 180°C durante 30-40 minutos.\n6. Deja reposar antes de servir.", 
            60, "/img/lasana.jpg"));
        
        recetas.add(new Receta(6L, "Pad Thai", "Un sabroso plato de fideos tailandés", "Tailandesa", 
            Arrays.asList("200g de fideos de arroz", "200g de tofu", "2 huevos", "50g de brotes de soja", "30g de cacahuetes", "2 cebolletas", "Salsa de pescado", "Salsa de tamarindo", "Azúcar de palma", "Chiles", "Limón"),
            "Tailandia", "Media",
            "1. Remoja los fideos en agua caliente.\n2. Mezcla la salsa con tamarindo, salsa de pescado y azúcar.\n3. Saltea el tofu y reserva.\n4. Saltea los huevos revueltos y reserva.\n5. Saltea los fideos con la salsa, añade el resto de ingredientes.\n6. Sirve con cacahuetes triturados, cebolleta y limón.", 
            25, "/img/pad_thai.jpg"));
        
        recetas.add(new Receta(7L, "Guacamole", "Una deliciosa salsa mexicana", "Mexicana", 
            Arrays.asList("3 aguacates maduros", "1 tomate", "1/2 cebolla", "1 chile jalapeño", "Cilantro fresco", "1 limón", "Sal"),
            "México", "Fácil",
            "1. Machaca los aguacates en un bol.\n2. Pica finamente el tomate, la cebolla, el jalapeño y el cilantro.\n3. Mezcla todos los ingredientes con el aguacate.\n4. Añade el jugo de limón y sal al gusto.\n5. Mezcla bien y ajusta el sabor si es necesario.\n6. Sirve inmediatamente con totopos.", 
            15, "/img/guacamole.jpg"));
        
        recetas.add(new Receta(8L, "Ratatouille", "Un sabroso guiso francés de verduras", "Francesa", 
            Arrays.asList("1 berenjena", "2 calabacines", "2 pimientos", "4 tomates", "1 cebolla", "2 dientes de ajo", "Hierbas provenzales", "Aceite de oliva", "Sal", "Pimienta"),
            "Francia", "Fácil",
            "1. Corta todas las verduras en rodajas finas.\n2. Sofríe la cebolla y el ajo en aceite de oliva.\n3. Añade el resto de verduras por capas.\n4. Espolvorea con hierbas provenzales, sal y pimienta.\n5. Cocina a fuego lento durante 1 hora.\n6. Sirve caliente o a temperatura ambiente.", 
            70, "/img/ratatouille.jpg"));
        
        recetas.add(new Receta(9L, "Hummus", "Una cremosa pasta de garbanzos", "Árabe", 
            Arrays.asList("400g de garbanzos cocidos", "60ml de tahini", "Jugo de 1 limón", "2 dientes de ajo", "Aceite de oliva", "Comino", "Sal", "Pimentón"),
            "Oriente Medio", "Fácil",
            "1. Tritura los garbanzos en un procesador de alimentos.\n2. Añade el tahini, jugo de limón, ajo, comino y sal.\n3. Procesa mientras añades aceite de oliva hasta obtener una textura suave.\n4. Ajusta el sabor y la consistencia si es necesario.\n5. Sirve en un bol, hace un hueco en el centro y añade aceite de oliva.\n6. Espolvorea con pimentón y sirve con pan de pita.", 
            10, "/img/hummus.jpg"));
        
        recetas.add(new Receta(10L, "Tiramisú", "Un delicioso postre italiano", "Italiana", 
            Arrays.asList("500g de mascarpone", "4 huevos", "100g de azúcar", "300ml de café fuerte", "30ml de amaretto", "200g de bizcochos de soletilla", "Cacao en polvo"),
            "Italia", "Media",
            "1. Separa las claras de las yemas. Bate las yemas con el azúcar.\n2. Añade el mascarpone a la mezcla de yemas.\n3. Monta las claras a punto de nieve y añádelas a la mezcla anterior.\n4. Mezcla el café con el amaretto.\n5. En un molde, alterna capas de bizcochos mojados en café y crema.\n6. Refrigera por 4 horas y espolvorea con cacao antes de servir.", 
            30, "/img/tiramisu.jpg"));
        // Añade más recetas aquí...
    }

    public List<Receta> obtenerTodasLasRecetas() {
        return new ArrayList<>(recetas);
    }

    public Optional<Receta> obtenerRecetaPorId(Long id) {
        return recetas.stream()
                      .filter(receta -> receta.getId().equals(id))
                      .findFirst();
    }

    public List<Receta> buscarRecetas(String nombre, String tipoCocina, String ingrediente, String paisOrigen, String dificultad) {
        return recetas.stream()
            .filter(r -> nombre == null || nombre.isEmpty() || r.getNombre().toLowerCase().contains(nombre.toLowerCase()))
            .filter(r -> tipoCocina == null || tipoCocina.isEmpty() || r.getTipoCocina().toLowerCase().contains(tipoCocina.toLowerCase()))
            .filter(r -> ingrediente == null || ingrediente.isEmpty() || r.getIngredientes().stream().anyMatch(i -> i.toLowerCase().contains(ingrediente.toLowerCase())))
            .filter(r -> paisOrigen == null || paisOrigen.isEmpty() || r.getPaisOrigen().toLowerCase().contains(paisOrigen.toLowerCase()))
            .filter(r -> dificultad == null || dificultad.isEmpty() || r.getDificultad().equalsIgnoreCase(dificultad))
            .toList();
    }
}