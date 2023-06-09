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
public class Caballo implements Comparable<Guerrero>,PuedeMontarse{

    public final int capacidad;
    public int ocupacion;
    public Guerrero[] ocupantes;

    public Caballo(Guerrero[] ocupante) {
        int contador = 0;
        for (int i = 0; i < ocupante.length; i++) {
            
            if (ocupante[i] instanceof Griego) {
                contador++;
            } 
        }
        if (contador!=ocupante.length) {// si es mayor que 0 significa que hay por lo menos un troyano
            this.capacidad = 100;//la capacidad sera 100
            ocupantes = new Guerrero[capacidad];
            ocupacion=0;
        } else {//se da por hecho que la capacidad es la longitud del array
            this.capacidad = ocupante.length;
            ocupacion=ocupante.length;
            ocupantes=ocupante;
        }
    }
    
    public Caballo(Guerrero guerrero,int capacida){
        if(guerrero instanceof Griego){
            capacidad=capacida;
            ocupantes[ocupacion]=guerrero;
            ocupacion++;
        }else{
            this.capacidad = capacida;//la capacidad sera 100
            ocupantes = new Guerrero[capacidad];
        }
    }
    public int buscar(String nombre){
        int contador=0;
        for (int i = 0; i < ocupacion; i++) {
            if(!nombre.equals(ocupantes[i].getNombre())){
            } else {
                contador=i;
                System.out.println(ocupantes[i].toString());
            }
        }
        if (contador==0){
            return 0;
        }else{
            return contador;
        }
    }
    
    
    @Override
    public int compareTo(Guerrero o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int montar(Guerrero g) {
      if(g instanceof Griego){
          ocupantes[ocupacion]=g;
          ocupacion++;
          return ocupacion;
      }else if(g instanceof Troyano){
          return -2; 
      }else{
          return -1;
      }
    }

    @Override
    public void desmontar() {
        for (int i = 0; i < ocupantes.length; i++) {
            ocupantes[i]=null;
        }
        ocupacion=0;
        ocupantes= new Guerrero[ocupacion];
        System.out.println("Se han desmontado a todos los guerreros,he aqui la longitud del array:"+ocupantes.length);
         }

   
   
    
    

}
