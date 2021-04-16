package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        // OBJECTS 2


        //Ex 1

        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

        autor1.mostrarAutor();

        Libro libro1 = new Libro("Effective Java", 450, 150, autor1);

        libro1.mostrarLibro();




    }
}
