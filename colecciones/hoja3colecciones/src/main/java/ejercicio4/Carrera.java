/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author iker
 */
public class Carrera {
    HashSet<Atleta> atletas;

    public Carrera() {
        this.atletas=new HashSet<>();
    }
    
    public void aniadir(Atleta a){
        atletas.add(a);
    }
    
    
    public double medio(){
        int suma = 0;
        for (Atleta atleta : atletas) {
            suma+=atleta.getTiempo();
        }return suma/atletas.size();
    }
     public void darVuelta() {
        if (atletas.isEmpty()) {
            System.out.println("No hay atletas en la carrera.");
            return;
        }
        Stack<Atleta> pila = new Stack<>();
        for (Atleta atleta : atletas) {
            pila.push(atleta);
        }
        atletas.clear();
        while (!pila.isEmpty()) {
            atletas.add(pila.pop());
        }
        System.out.println("Los atletas han dado la vuelta.");
    }

}
