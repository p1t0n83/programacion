/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author iker
 */
public class Almacen {
    HashSet<Articulo> articulos;

    public Almacen() {
        this.articulos = new HashSet<>();
    }
    
    public boolean insertar(Articulo e){
        return articulos.add(e);
    }
    
    public Articulo buscar(int codigo){
        Articulo a = null;
        Iterator<Articulo> it= articulos.iterator();
        while(!it.hasNext()){
            if(codigo==it.next().getCodigo()){
               a=(Articulo) it;
            }else{
                a=null;
            }
        }return a;
    }
    
    public void mostrar(){
        for (Articulo articulo : articulos) {
            if(articulo.getExistencias()<5){
                System.out.println(articulo.toString());
            }
        }
    }
}
    

