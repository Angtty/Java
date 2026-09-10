package org.example;

public class Bateria implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Al tocar la bateria suena Monster.");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando la tension del parche por medio de los tornillos.");
    }

}
