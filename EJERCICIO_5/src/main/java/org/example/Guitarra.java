package org.example;

public class Guitarra implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Al tocar la guitarra suena Yankee Rose");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando las clavijas de la guitarra");
    }

}
