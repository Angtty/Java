package org.example;

public class Circulo extends Figura implements Dibujable {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String dibujar() {
        return "Dibujando un circulo de area:" + area() +" y perimetro:" + perimetro();}
}