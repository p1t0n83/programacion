/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.ejercicio2hoja1;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author daw106
 */
public class Persona {
    private String nombre;
    private LocalDate fechaac;
    private String DNI;

    public Persona() {
        Teclado t= new Teclado();
        t.validaNombre();
        System.out.println("dia");
        int dia= new Scanner(System.in).nextInt();
        System.out.println("Mes");
        int mes= new Scanner(System.in).nextInt();
        System.out.println("Año");
        int ano=new Scanner(System.in).nextInt();
        fechaac=LocalDate.of(ano, mes, dia);
        System.out.println("DNI");
        DNI= new Scanner(System.in).next();
        t.validaDNI(DNI);
                }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaac() {
        return fechaac;
    }

    public void setFechaac(LocalDate fechaac) {
        this.fechaac = fechaac;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaac=" + fechaac + ", DNI=" + DNI + '}';
    }
    

   
    
}
