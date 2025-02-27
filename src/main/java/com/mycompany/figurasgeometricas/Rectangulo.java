
package com.mycompany.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica{
    private int lado1;
    private int lado2;
    
    //Complejidad: O(1) tiempo constante.
    public Rectangulo(String nombre, String color, int lado1, int lado2){
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Complejidad: O(1) tiempo constante.
    @Override
    public double obtenerArea(){
        return lado1*lado2;
    }
    
    //Complejidad: O(1) tiempo constante.
    @Override
    public double obtenerPerimetro(){
        return lado1*2 + lado2*2;
    }
}
