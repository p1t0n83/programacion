/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;


import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author iker
 */
public class Banco {
    LinkedHashSet<Cliente> clientes;

    public Banco() {
        this.clientes =new LinkedHashSet<>();
    }
    
     public boolean insertar(Cliente e){
        return clientes.add(e);
    }
    
    public void buscar(int codigo){
        Iterator<Cliente> it=clientes.iterator();
        while(!it.hasNext()){
            if(codigo==it.next().getCodigo()){
                System.out.println(it.toString());
            }
        }
    }
    
    public void borrar(int codigo){
        Iterator<Cliente> it=clientes.iterator();
        while(!it.hasNext()){
            if(codigo==it.next().getCodigo()){
                it.remove();
            }
        }
    }
}
