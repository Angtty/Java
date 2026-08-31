package org.example;

public class Viaje {

    public void iniciarViaje(Vehiculo vehiculo) {
        vehiculo.combustible();
        vehiculo.arrancar();
        vehiculo.detener();
    }

}
