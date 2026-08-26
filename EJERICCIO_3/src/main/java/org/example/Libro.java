package org.example;

public class Libro {

    private String titulo;
    private String autor;
    private int publicacion;


    public Libro (String titulo, String autor, int publicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }


    public String getautor(){
        return autor;
    }
    public void setautor(String autor){
        this.autor = autor;
    }


    public int getPublicacion(){
        return publicacion;
    }
    public void setPublicacion(int publicacion){
        this.publicacion = publicacion;
    }


    public void mostrarInformacion(){
        System.out.println("TITULO DEL LIBRO:" + getTitulo());
        System.out.println("AUTOR:" + getautor());
        System.out.println("AÑO DE PUBLICACION:" + getPublicacion());
    }
}
