package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE EL PRIMER NUMERO:");
        int numero1 = sc.nextInt();

        System.out.println("INGRESE EL SEGUNDO NUMERO:");
        int numero2 = sc.nextInt();

        System.out.println("INGRESE EL TERCER NUMERO:");
        int numero3 = sc.nextInt();

        int suma = numero1 + numero2 + numero3;
        double promedio = suma / 3.0;

        int mayor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        System.out.println("TOTAL: " + suma);
        System.out.println("PROMEDIO: " + promedio);
        System.out.println("NUMERO MAYOR: " + mayor);
    }
}