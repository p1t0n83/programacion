/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author daw106
 */
public class principal {
     public static void main(String[] args) {
         Pais p= new Pais("España");
         p.aniadir();
         p.aniadir();
         System.out.println(p.existe("Barcelona"));
         System.out.println(p.mediaHabitantes());
         System.out.println(p.CiudadConMasHabitantes());
         System.out.println(p.toString());
     }
}
