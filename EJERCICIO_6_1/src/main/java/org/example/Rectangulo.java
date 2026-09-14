package org.example;

public class Rectangulo extends Figura implements Dibujable{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return base * altura;
    }

    @Override
    public double perimetro(){
        return 2 * (base + altura);
    }

    @Override
    public String dibujar(){
        return "Dibujando un rectangulo de area:" + area() + " y perimetro:" + perimetro();
    }

}
