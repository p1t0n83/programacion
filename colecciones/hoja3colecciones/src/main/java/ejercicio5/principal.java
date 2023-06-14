/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.List;

/**
 *
 * @author iker
 */
public class principal {
    public static void main(String[] args) {
        try {
            Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 1, 5, 2023, 450);
            Libro libro2 = new Libro("1984", "George Orwell", 15, 6, 2023, 328);
            Disco disco1 = new Disco("Thriller", "Michael Jackson", 30, 11, 1982, 432);
            Disco disco2 = new Disco("Back in Black", "AC/DC", 25, 7, 1980, 42);
            Disco disco3 = new Disco("The Dark Side of the Moon", "Pink Floyd", 17, 3, 1973, 435);

            Tienda tienda = new Tienda();
            tienda.insertar(libro1);
            tienda.insertar(libro2);
            tienda.insertar(disco1);
            tienda.insertar(disco2);
            tienda.insertar(disco3);

            System.out.println(tienda.mostrar());

            Disco discoMasLargo = tienda.mayor();
            if (discoMasLargo != null) {
                System.out.println("Disco de mayor duración: " + discoMasLargo.getTitulo());
            }

            List<Libro> novedades = tienda.novedades();
            if (!novedades.isEmpty()) {
                System.out.println("Libros novedades:");
                for (Libro libro : novedades) {
                    System.out.println("- " + libro.getTitulo());
                }
            } else {
                System.out.println("No hay libros novedades en el mes actual.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
