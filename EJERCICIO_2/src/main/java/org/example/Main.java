package org.example;

import java.util.Scanner;
public class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE SU NOMBRE:");
        String nombreCliente = sc.nextLine();

        System.out.println("NOMBRE DEL PRODUCTO:");
        String nombreProducto = sc.nextLine();

        System.out.println("PRECIO:");
        double precioProducto = sc.nextDouble();

        System.out.println("CANTIDAD DE PRODUCTOS:");
        int cantidad = sc.nextInt();

        Cliente cliente = new Cliente(nombreCliente);
        Productos productos = new Productos(nombreProducto, precioProducto);
        Venta venta = new Venta(cliente, productos, cantidad);
        venta.mostrarDetalle();
        sc.close();

    }

}