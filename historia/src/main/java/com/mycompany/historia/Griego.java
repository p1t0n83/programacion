/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.historia;

/**
 *
 * @author DAW106
 */
public class Griego extends Guerrero{

    public Griego(String nombre, int fuerza, int edad) {
        super(nombre, fuerza, edad);
    }
 
    @Override
    public boolean retirarse() {
        if(isHerido()==true && isMuerto()==false){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();   }
    
}
