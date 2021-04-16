package com.company;

public class Libro {

    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro (String titulo, double precio, int stock, Autor autor){
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autor=autor;
    }

    public void mostrarLibro (){
        System.out.println("Titulo de libro:"+this.titulo+"  Precio:"+this.precio+"  Stock:"+this.stock+"  Autor:"+this.autor.getNombre()+" "+this.autor.getApellido()+"\n");
    }


}

