/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el3;

/**
 *
 * @author daw106
 */
public class principal {
     public static void main(String[] args) { 
         Agenda agen= new Agenda();
         Personas p = new Personas("iker","garcia","23456789T");
         Personas p2=new Personas("iker","garcia","23456789F");
         Personas p3=new Personas("iker","garcia","23456789N");
         agen.insertarPersona(p);
         agen.insertarPersona(p2);
         agen.insertarPersona(p3);
         agen.borrarDNI("23456789F");
         agen.mostrar();
     }
}
