package org.example;

public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = {
                new Carro(),
                new Moto(),
                new Bicicleta(),
        };

        Viaje viaje = new Viaje();

        for (Vehiculo ve: vehiculos ) {
            viaje.iniciarViaje(ve);
        }
    }
}