/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Atleta {
    private int dorsal;
    private String nombre;
    private double tiempo;
    
     public Atleta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dorsal del atleta: ");
        dorsal = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el nombre del atleta: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el tiempo del atleta: ");
        tiempo = Double.parseDouble(scanner.nextLine());
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
