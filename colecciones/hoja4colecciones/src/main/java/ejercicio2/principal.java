/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.HashSet;

/**
 *
 * @author DAW106
 */
public class principal {
    public static void main(String[] args) {
         HashSet<Persona> personas=new HashSet<>();
        Agenda a= new Agenda(personas);
        Persona persona = new Persona("iker","garcia","72281284");
        a.aniadir(persona);
        Persona persona2= new Persona("pablo","iturri","2345");
        a.aniadir(persona2);
        System.out.println(a.mostrar());
        a.modificar("2345", "72281284");
        a.modificar("2345", "23456");
       System.out.println(a.mostrar());
    }
}
