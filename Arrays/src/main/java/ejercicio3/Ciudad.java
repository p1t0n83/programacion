/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author daw106
 */
public class Ciudad {
    private String nombre;
    private int latitud;
    private int longitud;
    private int habitantes;

    public Ciudad(String nombre, int latitud, int longitud, int habitantes) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLatitud() {
        return latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getHabitantes() {
        return habitantes;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", habitantes=" + habitantes + '}';
    }
    
    
    
    
    
}
