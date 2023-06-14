/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author iker
 */
public abstract class Publicacion {

    protected String titulo;
    protected String autor;
    protected LocalDate fecha;

    public Publicacion(String titulo, String autor, int dia, int mes, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        try {
            this.fecha = LocalDate.of(anio, mes, dia);
        } catch (ExceptionInInitializerError eiie) {
            System.out.println(eiie.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
