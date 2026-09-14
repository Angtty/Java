package org.example;
import java.util.Scanner;

import java.util.*;

public class Notas {

    public double pedirNumero(Scanner sc){
        try {
            return sc.nextDouble();
        }catch (Exception e){
            System.out.println("Aviso No escribiste un numero.");
            sc.next();
            return 0;
        }
    }

    public ArrayList<Double> notaslista(Scanner sc) {
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Cuantas notas vas a ingresar para este estudiante?");
        double cantidad = pedirNumero(sc);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            notas.add(pedirNumero(sc));
        }
        return notas;
    }

    public void ingresarEstudiante(Scanner sc) {
        Map<String, ArrayList<Double>> estudiante = new HashMap<>();

        double respuesta = 1;
        while (respuesta == 1) {
            System.out.println("Ingrese el nombre del estudiante.");
            String nombre = sc.nextLine();
            ArrayList<Double> misNotas = notaslista(sc);

            estudiante.put(nombre, misNotas);

            System.out.println("Estudiante registrado: " + nombre + " - Notas: " + misNotas);
            System.out.println("Desea agregar otro estudiante?");
            System.out.println("SI -> 1 / NO -> 2");
            respuesta = pedirNumero(sc);
            sc.nextLine();
        }
        consultarEstudiante(sc, estudiante);
        aprobados(estudiante);
    }

    public double calcularPromedio(ArrayList<Double> notas) {
        try {
            if (notas.isEmpty()) return 0;
            double suma = 0;
            for (double n : notas) {
                suma = suma + n;
            }
            return suma / notas.size();
        } catch (Exception e) {
            System.out.println("Aviso: Ocurrió un error al calcular el promedio.");
            return 0;
        }
    }

    public void consultarEstudiante(Scanner sc, Map<String, ArrayList<Double>> estudiante){

        System.out.println("--- CONSULTA ---");
        System.out.println("Ingrese el estudiante que desea buscar:");
        String nombreBuscar = sc.nextLine();

        if (estudiante.containsKey(nombreBuscar)) {
            ArrayList<Double> notasEncontradas = estudiante.get(nombreBuscar);
            double prom = calcularPromedio(notasEncontradas);
            System.out.println("Estudiante encontrado: " + nombreBuscar + " - Notas: " + notasEncontradas + " - Promedio: " + prom);
        } else {
            System.out.println("El estudiante '" + nombreBuscar + "' no existe en el registro.");
        }
    }

    public void aprobados(Map<String, ArrayList<Double>> estudiante) {
        System.out.println("--- ESTUDIANTES APROBADOS (Promedio mayor a 3.0) ---");

        String mejorEstudiante = "";
        double promedioMayor = -1;

        // estudiante.keySet() nos da la lista con todos los nombres (claves)
        for (String nom : estudiante.keySet()) {
            ArrayList<Double> notasAlumno = estudiante.get(nom);
            double prom = calcularPromedio(notasAlumno);

            if (prom >= 3.0) {
                System.out.println("- " + nom + " (Promedio: " + prom + ")");
            }
            if (prom > promedioMayor) {
                promedioMayor = prom;
                mejorEstudiante = nom;
            }
        }

        //si el nombre NO esta vacio
        if (!mejorEstudiante.isEmpty()) {
            System.out.println("Estudiante con el promedio mas alto: " + mejorEstudiante
                    + " con " + promedioMayor);
        }
    }
}