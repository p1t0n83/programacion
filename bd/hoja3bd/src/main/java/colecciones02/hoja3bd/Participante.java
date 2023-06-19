/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja3bd;

/**
 *
 * @author iker
 */
public class Participante {
    private String dni;
    private String nombre;
    private Actividad actividad;

    public Participante() {
    }

    // Constructor, getters y setters
    // ...

    public Participante(String dni, String nombre, Actividad actividad) {
        this.dni = dni;
        this.nombre = nombre;
        this.actividad = actividad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Participante{" + "dni=" + dni + ", nombre=" + nombre + ", actividad=" + actividad + '}';
    }
    
    
}