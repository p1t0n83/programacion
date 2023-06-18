/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja5colecciones;

import java.util.HashMap;

/**
 *
 * @author iker
 */
public class Serie {

    private String nombre;
    private Enum<Tematicas> tematica;
    private String nacionalidad;
    private boolean finalizada;
    private HashMap<String, Capitulo> capitulos;

    public Serie(String nombre, Enum<Tematicas> tematica, String nacionalidad, boolean finalizada) {
        this.nombre =nombre;
        this.tematica = tematica;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.capitulos = new HashMap<>();
    }

    
     public void insertaCapitulo( Capitulo capitulo) {
        String clave=generarClaveCapitulo(nombre, capitulo.getNumeroTemporada(), capitulo.getCapitulosTemporada());
        if (capitulos.containsKey(clave)) {
            System.out.println("Error: El capítulo con clave " + clave + " ya existe.");
        } else {
            capitulos.put(clave, capitulo);
            System.out.println("Capítulo agregado exitosamente con clave " + clave + ".");
        }
    }
    
    public void eliminarCapitulo( String clave) {
        
        if (capitulos.containsKey(clave)==false) {
            System.out.println("Error: El capítulo con clave " + clave + " no existe.");
        } else {
            capitulos.remove(clave);
            System.out.println("Capítulo borrado exitosamente con clave " + clave + ".");
        }
    }
    
   public void visualizaCapitulos() {
        if (capitulos.isEmpty()) {
            System.out.println("No hay capítulos disponibles en la serie.");
        } else {
            System.out.println("Lista de capítulos:");
            for (String clave : capitulos.keySet()) {
                Capitulo capitulo = capitulos.get(clave);
                capitulo.toString();
                System.out.println("Clave: " + clave);
                System.out.println("---------------------");
            }
        }
    }
        
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enum<Tematicas> getTematica() {
        return tematica;
    }

    public void setTematica(Enum<Tematicas> tematica) {
        this.tematica = tematica;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public HashMap<String, Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(HashMap<String, Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return "Serie{" + "nombre=" + nombre + ", tematica=" + tematica + ", nacionalidad=" + nacionalidad + ", finalizada=" + finalizada + '}';
    }

    

    public  String generarClaveCapitulo(String nombreSerie, int numeroTemporada, int numeroCapitulo) {
        String nombreMayusculas = nombreSerie.substring(0, 4).toUpperCase();
        String temporada = String.format("%02d", numeroTemporada);
        String capitulo = String.format("%02d", numeroCapitulo);

        return nombreMayusculas + temporada + "X" + capitulo;
    }
}
