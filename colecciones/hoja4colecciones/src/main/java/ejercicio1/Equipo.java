/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAW106
 */
public class Equipo {
    private TreeSet<Jugador>  jugadores;

    public Equipo(TreeSet set) {
        jugadores=set;
    }
    
    public boolean insertar(Jugador jugador){
        boolean valido=false;
        try{
            jugadores.add(jugador);
            valido=true;
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            valido=false;
        }catch(Exception p){
            System.out.println(p.getMessage());
            valido=false;
        }return valido;
    }
    
    public boolean borrar(String nombre){
         boolean valido=false;
        try{
        Iterator<Jugador> it=jugadores.iterator();
        while(it.hasNext()){
            if(nombre.equalsIgnoreCase(it.next().getNombre())){
                it.remove();
            }
        }
        valido=true;
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage());
            valido=false;
        }catch(Exception e){
            System.out.println(e.getMessage());
            valido=false;
        }return valido;
    }
    
    public String mostrarTodos(){
        String cadena="Jugadores{\n";
        for (Jugador jugadore : jugadores) {
            cadena+=jugadore.toString()+".\n";
        }
        return cadena;
            }
    
    public Jugador masBajo(){
       double altura=jugadores.first().getEstatura();
       Jugador j=jugadores.first();
        for (Jugador jugadore : jugadores) {
            if(jugadore.getEstatura()<altura){
                altura=jugadore.getEstatura();
                j=jugadore;
            }
        }
        return j;
    }
    
     public Jugador masAlto(){
       double altura=jugadores.first().getEstatura();
       Jugador j=jugadores.first();
        for (Jugador jugadore : jugadores) {
            if(jugadore.getEstatura()>altura){
                altura=jugadore.getEstatura();
                j=jugadore;
            }
        }
        return j;
    }
     
    public SortedSet dosMetros(){
        SortedSet<Jugador> altisimos = new TreeSet<>();
        for (Jugador jugadore : jugadores) {
            if(jugadore.getEstatura()>2){
                altisimos.add(jugadore);
            }
        }
        return altisimos;
    } 
}
