package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el color de la figura");
        String color = scan.nextLine();
        System.out.println("Ingrese el tipo de figura");
        int figura = scan.nextInt();
        
        switch (figura){
            //Complejidad: O(1) tiempo constante.
            case 1:
                System.out.println("Ingrese el radio del círculo");
                double radio = scan.nextDouble();
                Circulo nuevoCirculo = new Circulo(nombre, color, radio);
                System.out.println(nuevoCirculo.obtenerArea());
                System.out.println("El circulo con nombre " + nuevoCirculo.getNombre() + " de color " + nuevoCirculo.getColor() + " tiene un area de " + nuevoCirculo.obtenerArea() +" y un perimetro de " + nuevoCirculo.obtenerPerimetro());
            break;
            //Complejidad: O(1) tiempo constante.
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                int lado1 = scan.nextInt();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                int lado2 = scan.nextInt();
                Rectangulo nuevoRectangulo = new Rectangulo(nombre, color, lado1, lado2);
                System.out.println("El rectángulo con nombre " + nuevoRectangulo.getNombre() + " de color " + nuevoRectangulo.getColor() + " tiene un area de " + nuevoRectangulo.obtenerArea()+" y un perimetro de " + nuevoRectangulo.obtenerPerimetro());
            break;
            //Complejidad: O(1) tiempo constante.
            case 3:
                System.out.println("Ingrese el valor de la base del triángulo");
                int base = scan.nextInt();
                System.out.println("Ingrese el valor de la altura del triángulo");
                int altura = scan.nextInt();
                Triangulo nuevoTriangulo = new Triangulo(nombre, color, base, altura);
                System.out.println("El triángulo con nombre " + nuevoTriangulo.getNombre() + " de color " + nuevoTriangulo.getColor() + " tiene un area de " + nuevoTriangulo.obtenerArea() +" y un perimetro de " + nuevoTriangulo.obtenerPerimetro());
            break;
        }
    }
}
