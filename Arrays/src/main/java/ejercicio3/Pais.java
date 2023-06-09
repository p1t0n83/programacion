/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw106
 */
public class Pais {

    private String nombrePais;
    private Ciudad ciudades[];
    private int ciudadesT;

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
        this.ciudades = new Ciudad[25];
        this.ciudadesT = 0;
    }

    public void aniadir() {
        if (ciudadesT < ciudades.length) {
            System.out.println("Añade los datos de la ciudad:");
            System.out.println("Nombre:");
            String nombreCiudad = new Scanner(System.in).nextLine();
            System.out.println("Latitud:");
            int latitud = new Scanner(System.in).nextInt();
            System.out.println("Longitud:");
            int longitud = new Scanner(System.in).nextInt();
            System.out.println("Habitantes:");
            int habitantes = new Scanner(System.in).nextInt();
            Ciudad c = new Ciudad(nombreCiudad, latitud, longitud, habitantes);
            ciudades[ciudadesT] = c;
            ciudadesT++;
        } else {
            System.out.println("No se pueden añadir mas ciudades");
        }
    }

    public Ciudad CiudadConMasHabitantes() {
        Ciudad ciudad = ciudades[0];
        for (int i = 1; i < ciudadesT; i++) {
            if (ciudades[i].getHabitantes() > ciudad.getHabitantes()) {
                ciudad = ciudades[i];
            }
        }
        return ciudad;
    }

    public boolean existe(String nombre) {
        boolean existe = false;
        for (int i = 0; i < ciudadesT; i++) {
            if (nombre.equalsIgnoreCase(ciudades[i].getNombre())) {
                existe = true;
            }
        }
        return existe;
    }

    public double mediaHabitantes() {
        int suma = 0;
        for (int i = 0; i < ciudadesT; i++) {
            suma += ciudades[i].getHabitantes();
        }
        return suma / ciudadesT;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + ", ciudadesT=" + ciudadesT + '}';
    }

}
