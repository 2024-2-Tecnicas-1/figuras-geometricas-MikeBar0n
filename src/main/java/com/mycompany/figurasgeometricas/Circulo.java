package com.mycompany.figurasgeometricas;

public class Circulo extends FiguraGeometrica{
    
    private double radio;
    
    //Complejidad: O(1) tiempo constante.
    public Circulo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio = radio;
    }
    
    //Complejidad: O(1) tiempo constante.
    @Override
    public double obtenerArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    //Complejidad: O(1) tiempo constante.
    @Override
    public double obtenerPerimetro(){
        return (2*Math.PI)*radio;
    }
}
