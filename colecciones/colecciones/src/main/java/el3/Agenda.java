/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el3;

import com.mycompany.colecciones.ejercicio2hoja1.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author daw106
 */
public class Agenda {

    ArrayList<Personas> personas = new ArrayList<>();

    public Agenda() {
    }

    public void insertarPersona(Personas p) {

        if (personas.add(p)) {
            System.out.println("Se inserto correctamente");
        } else {
            System.out.println("Hubo un error");
        }
    }

    public void borrarDNI(String DNI) {
        Iterator<Personas> it = personas.iterator();       
           for (Personas persona : personas) {
                if (DNI.equals(persona.getDNI())) {
                    personas.remove(persona);
                }
            }        
    }

    public void mostrar() {
        for (Personas persona : personas) {
            System.out.println(persona.toString());
        }
    }

}
