/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author DAW106
 */
public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private double estatura;

    public Jugador(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.estatura) ^ (Double.doubleToLongBits(this.estatura) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return Double.doubleToLongBits(this.estatura) == Double.doubleToLongBits(other.estatura);
    }

    @Override
    public String toString() {
        return  "Nombre=" + nombre + ", estatura=" + estatura + '}';
    }

    @Override
    public int compareTo(Jugador o) {
        return 0;
    }


    
    
}
