package org.example;

import java.util.Scanner;

public class Medidas {

    public double pedirNumero(Scanner sc){
        try {
            return sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Aviso: No escribiste un numero.");
            sc.next();
            return 0;
        }
    }

    public void calcularFiguras(Scanner sc) {
        System.out.println("INGRESE LAS MEDIDAS DEL CIRCULO");
        System.out.print("Ingrese el radio: ");
        double radio = pedirNumero(sc);
        Circulo c = new Circulo(radio);
        System.out.println(c.dibujar());

        System.out.println("INGRESE LAS MEDIDAS DEL RECTANGULO");
        System.out.print("Ingrese la base: ");
        double base = pedirNumero(sc);
        System.out.print("Ingrese la altura: ");
        double altura = pedirNumero(sc);
        Rectangulo r = new Rectangulo(base, altura);
        System.out.println(r.dibujar());

        System.out.println("INGRESE LAS MEDIDAS DEL TRIANGULO");
        System.out.print("Ingrese la base: ");
        double base_tri = pedirNumero(sc);
        System.out.print("Ingrese la altura: ");
        double altura_tri = pedirNumero(sc);
        System.out.print("Ingrese el lado A: ");
        double ladoA = pedirNumero(sc);
        System.out.print("Ingrese el lado B: ");
        double ladoB = pedirNumero(sc);
        Triangulo t = new Triangulo(base_tri, altura_tri, ladoA, ladoB);
        System.out.println(t.dibujar());


        System.out.println("...........................");

        Figura[] figuras = { c, r, t };
        double figuraMayor = figuras[0].area();

        for (Figura figura : figuras) {
            System.out.println("Area de " + figura.getClass().getSimpleName() + ": " + figura.area());

            if (figura.area() > figuraMayor) {
                figuraMayor = figura.area();
            }
        }

        System.out.println("El area mayor es: " + figuraMayor);
    }
}





