package com.mycompany.figurasgeometricas;

public class Circulo extends FiguraGeometrica{
    
    private double radio;
    
    //Complejidad: O(1) tiempo constante.
    public Circulo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio = radio;
    }
    
    //Complejidad: O(1) tiempo constante.
    public double obtenerArea(double radio){
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    
    //Complejidad: O(1) tiempo constante.
    public double obtenerPerimetro(double radio){
        double perimetro = (2*Math.PI)*radio;
        return perimetro;
    }
}
