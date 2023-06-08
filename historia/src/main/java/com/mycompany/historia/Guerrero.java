/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.historia;

/**
 *
 * @author DAW106
 */
public abstract class Guerrero {
    private final String nombre;
    private int fuerza;
    private int edad;
    private boolean herido;
    private boolean muerto;

    public Guerrero(String nombre, int fuerza, int edad) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.edad = edad;
        this.herido=false;
        this.muerto=false;
        if(comprobarEdad(edad)==false || comprobarFuerza(fuerza)==false){
            this.fuerza=5;
            this.edad=25;
        }
    }
    
    public Guerrero(){
        this("GuerreroX", 1, 15);
    }
    
    public Guerrero(Guerrero g,String nom){
        Guerrero copia=g;
        this.nombre=nom;   
    }
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.fuerza;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guerrero other = (Guerrero) obj;
        return this.fuerza == other.fuerza;
    }

   
    protected static boolean comprobarEdad(int e){
        if(e>=15 && e<=60){
           return true;
        }else{
            return false;
        }
    }
    
    protected static boolean comprobarFuerza(int f){
        if(f>=1 && f<=10){
            return true;
        }else{
            return false;
        }
    }
    
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", edad=" + edad + ", herido=" + herido + ", muerto=" + muerto + '}';
    }
    
    
    public abstract boolean retirarse();
}




