/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.ejercicio2hoja1;

import java.util.ArrayList;

/**
 *
 * @author daw106
 */
public class principal {
     public static void main(String[] args) { 
         ArrayList<Persona> p = null;
         Asociacion a = new Asociacion(p);
         Persona personita1=new Persona();
         Persona personita2=new Persona();
         a.insertar(personita1);
         a.insertar(personita2);
         a.mostrar();
         a.buscarDNI("72281284N");
     }
}
