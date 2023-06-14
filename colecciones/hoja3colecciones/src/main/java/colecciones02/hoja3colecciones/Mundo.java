/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja3colecciones;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author iker
 */
public class Mundo {
    private HashSet <Pais> mundo;

    public Mundo(HashSet<Pais> mundo) {
        this.mundo = new HashSet<>();
    }
    
    public void aniadir(Pais pa){
        mundo.add(pa);
    }
    public void borrar(String nombre){
        Iterator<Pais> it= mundo.iterator();
        while(it.hasNext()){
            if(nombre.equals(it.next().getNombre())){
                it.remove();
            }
        }
    }
    
    public void mostrar(){
        for (Pais pais : mundo) {
            System.out.println(pais.toString());
        }
    }
}
