/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.ejercicio2hoja1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daw106
 */
public class Teclado {

    public String validaNombre() {
        String nombre="";
        try {
            System.out.println("Nombre:");
            nombre=new Scanner(System.in).next();
            Pattern pattern = Pattern.compile("[a-zA-Z-áÁ-éÉ-íÍ-óÓ-úÚ]");
            Matcher matcher = pattern.matcher(nombre);
            if (nombre.length() < 3) {
                matcher = pattern.matcher(nombre);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return  nombre;
    }

    public String validaDNI(String dni) {
        try {

            Pattern pattern = Pattern.compile("[0-9]{8}[a-zA-Z]{1}");
            Matcher matcher = pattern.matcher(dni);

        } catch (IndexOutOfBoundsException io) {
            System.out.println(io.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dni;
    }
    
    public double cuota(LocalDate fecha){
        int edad=Period.between(LocalDate.now(), fecha).getYears();              
       double cuota=0;
       if(edad<=10 && edad>=5){
           cuota=1;
       }else if(edad>=11 && edad<=17){
           cuota=2.5;
       }else{
           cuota=3.5;
       }
        return cuota;
    }
}
