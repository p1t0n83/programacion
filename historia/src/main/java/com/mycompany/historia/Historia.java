/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.historia;

/**
 *
 * @author DAW106
 */
public class Historia {

    public static void main(String[] args) {
        Guerrero[] guerreros=new Guerrero[2];
        Troyano troyano= new Troyano("iker", 1, 1);
        Griego griego=new Griego("elio", 10, 23);
        guerreros[0]=troyano;
        guerreros[1]=griego;
        System.out.println(guerreros[0].toString());
        System.out.println(guerreros[1].toString());
        
        
    }
}
