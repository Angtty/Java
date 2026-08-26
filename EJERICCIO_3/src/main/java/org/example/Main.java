package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro[] libros = new Libro[2];

        for (int i = 0; i < libros.length; i++) {

            System.out.println("--- Libro " + (i + 1) + " ---");
            System.out.println("Ingrese el titulo: ");
            String titulo = sc.nextLine();
            System.out.println("Ingrese el autor: ");
            String autor = sc.nextLine();
            System.out.println("Ingrese el año de lanzamiento: ");
            int publicacion = sc.nextInt();
            sc.nextLine();

            libros[i] = new Libro("","",0);

            libros[i].setTitulo(titulo);
            libros[i].setautor(autor);
            libros[i].setPublicacion(publicacion);
        }


        System.out.println("---LIBROS REGISTRADOS---");
        for (int i = 0; i < libros.length; i++) {
            libros[i].mostrarInformacion();
            System.out.println("--------------------------");
        }


        System.out.println("QUE LIBRO DESEAS BUSCAR?");
        String buscar = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < libros.length; i++) {
            if (buscar.equalsIgnoreCase(libros[i].getTitulo())) {
                libros[i].mostrarInformacion();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("NO SE ENCONTRO UN LIBRO CON ESE TITULO");
        }


        Libro libroMasAntiguo = libros[0];

        for (int i = 1; i < libros.length; i++) {
            if (libros[i].getPublicacion() < libroMasAntiguo.getPublicacion()) {
                libroMasAntiguo = libros[i];
            }
        }

        System.out.println("--- El libro más antiguo es ---");
        libroMasAntiguo.mostrarInformacion();

        }
    }
