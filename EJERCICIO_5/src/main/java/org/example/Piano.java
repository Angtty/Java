package org.example;

public class Piano implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Al tocar el piano suena Mozart.");
    }

    @Override
    public void afinar() {
        System.out.println("Se ajusta el volumen del piano.");
    }

}
