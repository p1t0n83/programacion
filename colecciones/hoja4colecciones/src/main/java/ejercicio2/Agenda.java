/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author DAW106
 */
public class Agenda {
    HashSet<Persona> personas;

    public Agenda(HashSet<Persona> personas) {
        this.personas = personas;
    }

   public void aniadir(Persona persona){
       try{
           personas.add(persona);
       }catch(NullPointerException np){
           System.out.println(np.getMessage());
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
   }
   
   public void borrar(String DNI){
       Iterator<Persona> it= personas.iterator();
      try{ while(it.hasNext()){
           if(DNI.equals(it.next().getDNI())){
               it.remove();
           }
       }
   }catch(NullPointerException ne){
          System.out.println(ne.getMessage());
   }catch(Exception e){
          System.out.println(e.getMessage());
   }
   }
   
   public String mostrar(){
    String personitas="";
    try{          
        for (Persona persona : personas) {
           personitas+=persona.toString()+"\n";
       }}catch(NullPointerException ne){
           System.out.println(ne.getMessage());
       }return personitas;
   }
   public void buscar(String DNI){
       Iterator<Persona> it= personas.iterator();
      try{ while(it.hasNext()){
           if(DNI.equals(it.next().getDNI())){
               System.out.println(it.toString());
           }
       }
   }catch(NullPointerException ne){
          System.out.println(ne.getMessage());
   }catch(Exception e){
          System.out.println(e.getMessage());
   }
   }
   
   public void modificar(String DNI,String nuevoDNI){
      Iterator<Persona> it= personas.iterator();
      try{ while(it.hasNext()){
          if(personas.contains(nuevoDNI)==false){
           if(DNI.equals(it.next().getDNI())){
              it.next().setDNI(nuevoDNI);
           }}else{
              System.out.println("Este DNI ya esta dentro de la agenda,no se puede añadir");
          }
       }
   }catch(NullPointerException ne){
          System.out.println(ne.getMessage());
   }catch(Exception e){
          System.out.println(e.getMessage());
   }
   }
}
