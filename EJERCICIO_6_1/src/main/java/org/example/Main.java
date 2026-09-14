package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medidas medidas = new Medidas();
        medidas.calcularFiguras(sc);
    }
}