/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.time.LocalDate;

/**
 *
 * @author iker
 */
public class Libro extends Publicacion{
    
   private int numPaginas;

    public Libro(String titulo, String autor, int dia, int mes, int anio,int numPaginas) {
        super(titulo, autor, dia, mes, anio);
        this.numPaginas=numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    
   
    
    
}
