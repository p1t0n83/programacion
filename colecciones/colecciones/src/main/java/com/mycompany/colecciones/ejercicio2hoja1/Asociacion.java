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
public class Asociacion {
    ArrayList<Persona> personas=new ArrayList<>();

    
    

    public Asociacion(ArrayList<Persona> p) {
        this.personas = personas;
    }

    public void insertar(Persona p){
       personas.add(p);
        
        
    }
    public void buscarDNI(String DNI){
       Teclado t =new Teclado();
        for (Persona persona : personas) {
            if(DNI.equals(persona.getDNI())){
                System.out.println(persona+", a de pagar "+t.cuota(persona.getFechaac()));
        }
        }
    }
    public double recaudacionTotal(){
        Teclado t= new Teclado();
        double suma=0;
        for (Persona persona : personas) {
            suma=t.cuota((persona.getFechaac()));
        }return suma;
    }
    
    public void mostrar(){
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
}
