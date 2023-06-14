/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author iker
 */
public class Disco extends Publicacion{
    private int duracionMinutos;

    public Disco(String titulo, String autor, int dia, int mes, int anio,int duracion) {
        super(titulo, autor, dia, mes, anio);
        this.duracionMinutos=duracion;
        
        
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
}
