package com.duoc.web_seguro;

import java.time.LocalDateTime;
import java.util.List;

public class Receta {
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaCreacion;
    private String tipoCocina;
    private List<String> ingredientes;
    private String paisOrigen;
    private String dificultad;
    private String instrucciones;
    private int tiempoCoccion;
    private String urlFoto;

    public Receta(Long id, String nombre, String descripcion, String tipoCocina, List<String> ingredientes, 
                  String paisOrigen, String dificultad, String instrucciones, int tiempoCoccion, String urlFoto) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = LocalDateTime.now();
        this.tipoCocina = tipoCocina;
        this.ingredientes = ingredientes;
        this.paisOrigen = paisOrigen;
        this.dificultad = dificultad;
        this.instrucciones = instrucciones;
        this.tiempoCoccion = tiempoCoccion;
        this.urlFoto = urlFoto;
    }

    // Getters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public String getTipoCocina() { return tipoCocina; }
    public List<String> getIngredientes() { return ingredientes; }
    public String getPaisOrigen() { return paisOrigen; }
    public String getDificultad() { return dificultad; }
    public String getInstrucciones() { return instrucciones; }
    public int getTiempoCoccion() { return tiempoCoccion; }
    public String getUrlFoto() { return urlFoto; }
}