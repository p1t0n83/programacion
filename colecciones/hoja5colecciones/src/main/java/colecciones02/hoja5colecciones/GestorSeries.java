/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja5colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author iker
 */
public class GestorSeries {

    HashSet<Serie> series;

    public GestorSeries() {
        this.series = new HashSet<>();
    }

    public Serie existeSerie(String nombre) {
        Serie s = null;
        for (Serie sery : series) {
            if (nombre.equalsIgnoreCase(sery.getNombre())) {
                s = sery;
            }
        }
        return s;
    }

    public void crearSerie() {
       
        String nombre = Teclado.solicitarNombre();
        
        System.out.println("Introduce la nacionalidad:");
        String nacionalidad = new Scanner(System.in).nextLine();
        System.out.println("Las opciones son:\n"
                + "1.Policial.\n"
                + "2.Comedia.\n"
                + "3.Infantil.\n."
                + "4.Aventura.");
        System.out.println("Eligue una tematica");
        int opcion = new Scanner(System.in).nextInt();
        Enum<Tematicas> tematica = tematicaInsertar(opcion);
        System.out.println("Introduce la temporada");
        int temporada = Teclado.validarTemporadas(Teclado.solicitarTemporadas());
        System.out.println("Serie finalizada? si/no");
        String finalizada = new Scanner(System.in).next();
        boolean finalizad = false;
        if (finalizada.equalsIgnoreCase("si")) {
            finalizad = true;
        }
        boolean existe = false;
        for (Serie sery : series) {
            if (nombre.equalsIgnoreCase(sery.getNombre())) {
                existe = true;
            }
        }
        if (existe == false) {
            Serie e = new Serie(nombre, tematica, nacionalidad, finalizad);
            series.add(e);
        }
    }

    public void eliminarSerie() {
        System.out.println("Nombre de la serie a borrar:");
        String nombre = new Scanner(System.in).nextLine();
        Iterator<Serie> it = series.iterator();
        int contador = 0;
        while (it.hasNext()) {
            if (nombre.equalsIgnoreCase(it.next().getNombre())) {
                it.remove();
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se borro we");
        }
    }

    public void verSeries() {
        System.out.println("1.todas\n"
                + "2.por tematica.\n"
                + "3. por nacionalidad\n");
        int opcion = new Scanner(System.in).nextInt();
        switch (opcion) {
            case 1 -> {
                for (Serie sery : series) {
                    System.out.println(sery.toString());
                }
            }
            case 2 -> {
                System.out.println("Ingrese la tematica");
                int opcion2 = new Scanner(System.in).nextInt();
                Enum<Tematicas> tematica = tematicaInsertar(opcion2);
                Iterator<Serie> it = series.iterator();
                while (it.hasNext()) {
                    if (tematica.equals(it.next().getTematica())) {
                        System.out.println(it.toString());
                    }
                }
            }
            case 3 -> {
                System.out.println("Ingrese la nacionalidad");
                String nacionalidad = new Scanner(System.in).nextLine();
                Iterator<Serie> it = series.iterator();
                while (it.hasNext()) {
                    if (nacionalidad.equals(it.next().getNacionalidad())) {
                        System.out.println(it.toString());
                    }
                }
            }
        }
    }

    public void crearCapitulo() {
    System.out.println("Nombre de la serie:");
    String nombre = new Scanner(System.in).nextLine();
    Serie serie = existeSerie(nombre);

    if (serie != null) {
        System.out.println("Numero de temporada:");
        int numeroTemporada = Teclado.validarTemporadas(Teclado.solicitarTemporadas());
        System.out.println("Capitulo de la temporada:");
        int capitulo = new Scanner(System.in).nextInt();
        System.out.println("Descripción:");
        String descripcion = new Scanner(System.in).nextLine();
        Capitulo nuevoCapitulo = new Capitulo(numeroTemporada, capitulo, descripcion);

        serie.insertaCapitulo(nuevoCapitulo);
        System.out.println("Capítulo añadido correctamente.");
    }
}
        
  
    public void eliminarCapitulo() {
    System.out.println("Nombre de la serie:");
    String nombre = new Scanner(System.in).nextLine();
    Serie serie = existeSerie(nombre);

    if (serie != null) {
        System.out.println("Numero de temporada:");
        int numeroTemporada = Teclado.validarTemporadas(Teclado.solicitarTemporadas());
        System.out.println("Capitulo de la temporada:");
        int capitulo = new Scanner(System.in).nextInt();
        String claveCapitulo = serie.generarClaveCapitulo(nombre, numeroTemporada, capitulo);
        
        serie.eliminarCapitulo(claveCapitulo);
        System.out.println("Capítulo eliminado correctamente.");
    }
}
    
    public void verCapitulos() {
    System.out.println("Nombre de la serie:");
    String nombre = new Scanner(System.in).nextLine();
    Serie serie = existeSerie(nombre);

    if (serie != null) {
        serie.visualizaCapitulos();
    }
}

    
    
    public static Enum<Tematicas> tematicaInsertar(int opcion) {
        if (opcion == 1) {
            return Tematicas.Policial;
        } else if (opcion == 2) {
            return Tematicas.Comedia;
        } else if (opcion == 3) {
            return Tematicas.Infantil;
        } else {
            return Tematicas.Aventura;
        }
    }
}
