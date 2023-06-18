/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja5colecciones;

/**
 *
 * @author iker
 */
public class Capitulo {
    private int numeroTemporada;
    private int capitulo;
    private String descripcion;

    public Capitulo(int numeroTemporada, int capitulosTemporada, String descripcion) {
        this.numeroTemporada = numeroTemporada;
        this.capitulo = capitulosTemporada;
        this.descripcion = descripcion;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getCapitulosTemporada() {
        return capitulo;
    }

    public void setCapitulosTemporada(int capitulosTemporada) {
        this.capitulo = capitulosTemporada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Capitulo{" + "numeroTemporada=" + numeroTemporada + ", capitulo=" + capitulo + ", descripcion=" + descripcion + '}';
    }
    
    
}
