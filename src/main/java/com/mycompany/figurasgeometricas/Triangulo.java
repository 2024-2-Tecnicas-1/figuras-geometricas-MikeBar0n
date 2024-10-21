package com.mycompany.figurasgeometricas;

public class Triangulo extends FiguraGeometrica{
    private int base;
    private int altura;
    
    //Complejidad: O(1) tiempo constante.
    public Triangulo(String nombre, String color, int base, int altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    
    //Complejidad: O(1) tiempo constante.
    @Override
    public double obtenerArea(){
        return (base*altura)/2;
    }
    
    //Complejidad: O(1) tiempo constante.
    @Override
    public double obtenerPerimetro(){
        return base*3;
    }
}
