
package com.mycompany.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica{
    int lado1;
    int lado2;
    
    //Complejidad: O(1) tiempo constante.
    public Rectangulo(String nombre, String color, int lado1, int lado2){
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Complejidad: O(1) tiempo constante.
    public double obtenerArea(int lado1, int lado2){
        double area = lado1*lado2;
        return area;
    }
}
