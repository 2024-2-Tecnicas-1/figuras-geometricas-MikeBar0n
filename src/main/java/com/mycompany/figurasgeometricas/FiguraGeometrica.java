package com.mycompany.figurasgeometricas;

abstract class FiguraGeometrica {
    private String nombre;
    private String color;
    
    //Complejidad: O(1) tiempo constante.
    public FiguraGeometrica(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }
    
    //Complejidad: O(1) tiempo constante.
    public String getNombre(){
        return nombre;
    }
    
    //Complejidad: O(1) tiempo constante.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Complejidad: O(1) tiempo constante.
    public String getColor(){
        return color;
    }
    
    //Complejidad: O(1) tiempo constante.
    public void setColor(String color){
        this.color = color;
    }
    
    //Complejidad: O(1) tiempo constante.
    public abstract double obtenerArea();
    
    //Complejidad: O(1) tiempo constante.
    public abstract double obtenerPerimetro();
}