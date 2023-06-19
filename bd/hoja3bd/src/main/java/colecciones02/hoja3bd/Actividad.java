/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja3bd;

/**
 *
 * @author iker
 */
public class Actividad {
    private int id;
    private String nombre;
    private String horario;
    private int plazasTotales;
    private int plazasLibres;

    public Actividad() {
    }

    public Actividad(int id, String nombre, String horario, int plazasTotales, int plazasLibres) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.plazasTotales = plazasTotales;
        this.plazasLibres = plazasLibres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    public int getPlazasLibres() {
        return plazasLibres;
    }

    // Constructor, getters y setters
    // ...
    public void setPlazasLibres(int plazasLibres) {
        this.plazasLibres = plazasLibres;
    }

    @Override
    public String toString() {
        return "Actividad [ID: " + id + ", Nombre: " + nombre + ", Horario: " + horario + ", Plazas Libres: " + plazasLibres + "]";
    }
    
    
}



