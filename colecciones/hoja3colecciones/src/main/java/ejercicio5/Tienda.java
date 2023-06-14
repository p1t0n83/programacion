/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author iker
 */
public class Tienda {
    HashSet<Publicacion> tienda;

    public Tienda() {
        this.tienda=new HashSet();
    }
    
    public void insertar(Publicacion e){
        try{
            tienda.add(e);
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }catch(ClassCastException cce){
            System.out.println(cce.getMessage());
        }
    }
    public void borrar(String titulo){
        Iterator<Publicacion> it=tienda.iterator();
        while(!it.hasNext()){
            if(titulo.equalsIgnoreCase(it.next().getTitulo())){
                it.remove();
            }
        }
    }
        public String mostrar(){
            String cadena="Discos:\n";
            for (Publicacion publicacion : tienda) {
                if(publicacion instanceof Disco){
                    cadena+=publicacion.toString()+"\n";
                }
            }
            cadena+="Libros:\n";
             for (Publicacion publicacion : tienda) {
                if(publicacion instanceof Libro){
                    cadena+=publicacion.toString()+"\n";
                }
            }
            return cadena;
        }
        
        public Disco mayor(){
            Disco disco=null;
            int mayor=0;
            for (Publicacion publicacion : tienda) {
                if(publicacion instanceof Disco){
                    if(((Disco) publicacion).getDuracionMinutos()>mayor){
                        disco=(Disco) publicacion;
                        mayor=((Disco) publicacion).getDuracionMinutos();
                    }
                }
            } return disco;
        }
        
        public List novedades(){
            LinkedList<Libro> novedosos = new LinkedList<>();
            for (Publicacion publicacion : tienda) {
                if(publicacion instanceof Libro){
                   if(((Libro) publicacion).getNumPaginas()>400 && publicacion.getFecha().getMonth()==LocalDate.now().getMonth()){
                       novedosos.add((Libro) publicacion);
                   }
                }
        }return novedosos;
    }
}

