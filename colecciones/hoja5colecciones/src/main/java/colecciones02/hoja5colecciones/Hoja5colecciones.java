/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colecciones02.hoja5colecciones;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Hoja5colecciones {

    public static void main(String[] args) {
          GestorSeries gestorSeries = new GestorSeries();
        int opcion;

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Añadir serie");
            System.out.println("2. Eliminar serie");
            System.out.println("3. Ver series almacenadas");
            System.out.println("4. Añadir capítulo a una serie ya almacenada");
            System.out.println("5. Borrar capítulo de una serie ya almacenada");
            System.out.println("6. Ver capítulos de una serie ya almacenada");
            System.out.println("7. Salir");

            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1->{
                    gestorSeries.crearSerie();
                    
                }case 2->{
                    gestorSeries.eliminarSerie();
                    
                }case 3->{
                    gestorSeries.verSeries();
                   
                }case 4->{
                    gestorSeries.crearCapitulo();
                   
                }case 5->{
                    gestorSeries.eliminarCapitulo();
               
                }case 6->{
                    gestorSeries.verCapitulos();
                  
                }case 7->{
                    System.out.println("¡Hasta luego!");
                }
            }
        } while (opcion != 7);
    }
}


