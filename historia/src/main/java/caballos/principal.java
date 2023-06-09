/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caballos;

import com.mycompany.historia.Griego;
import com.mycompany.historia.Guerrero;
import com.mycompany.historia.Troyano;

/**
 *
 * @author DAW106
 */
public class principal {
      public static void main(String[] args) {
         Troyano t= new Troyano("Manuel", 10, 23);
         Griego g= new Griego("iker",7,18);
         Griego[] ocupantes= new Griego[4];
         
         Caballo c= new Caballo(ocupantes);
       
         System.out.println(c.montar(t));
           c.montar(g);
         Griego g2= new Griego("Paco",7,18);
         c.montar(g2);
         System.out.println(c.buscar("Paco"));
         System.out.println(c.buscar("iker"));
         c.desmontar();
      }
}
