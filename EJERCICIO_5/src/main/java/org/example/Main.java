package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Instrumentos musicales");

        InstrumentoMusical[] orquesta = {
                new Guitarra(),
                new Piano(),
                new Bateria()
        };


        for (InstrumentoMusical instrumento : orquesta) {
            instrumento.tocar();
            instrumento.afinar();
            System.out.println("------------------------------------------");
        }
    }
}


