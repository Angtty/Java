package org.example;

public class Triangulo extends Figura implements Dibujable{
    private double base_tri;
    private double altura_tri;
    private double lado_a;
    private double lado_b;
    ;

    public Triangulo(double base_tri, double altura_tri, double lado_a, double lado_b) {
        this.base_tri = base_tri;
        this.altura_tri = altura_tri;
        this.lado_a = lado_a;
        this.lado_b = lado_b;
    }

    @Override
    public double area(){
        return  (base_tri * altura_tri) / 2;
    }

    @Override
    public double  perimetro(){
        return lado_a + lado_b + base_tri;
    }

    @Override
    public String dibujar(){
        return "Dibujando un triangulo de area:" + area() +" y perimetro:" + perimetro();
    }

}
