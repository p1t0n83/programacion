/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colecciones02.hoja2bd;

import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author iker
 */
// Clase principal que contiene el menú de opciones
public class ClinicaDental {
    public static void main(String[] args) {
        MetodosBD metodosBD = MetodosBD.getInstancia();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------ Menú ------");
            System.out.println("1. Insertar paciente");
            System.out.println("2. Crear visitas");
            System.out.println("3. Mostrar agenda del día");
            System.out.println("4. Visitas de un paciente");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            int opcion = Teclado.leerEntero();

            switch (opcion) {
                case 1:
                    System.out.println("------ Insertar Paciente ------");
                    System.out.print("DNI: ");
                    String dni = Teclado.leerDNI();
                    System.out.print("Nombre: ");
                    String nombre = Teclado.leerCadena();
                    System.out.print("Teléfono: ");
                    String telefono = Teclado.leerTelefono();
                    metodosBD.insertarPaciente(dni, nombre, telefono);
                    break;

                case 2:
                    System.out.println("------ Crear Visitas ------");
                    System.out.print("DNI del paciente: ");
                    dni = Teclado.leerDNI();
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    Date fecha = (Date) Teclado.leerFecha();
                    System.out.print("Tratamiento: ");
                    String tratamiento = Teclado.leerCadena();
                    System.out.print("Observaciones: ");
                    String observaciones = Teclado.leerCadena();
                    metodosBD.crearVisita(dni, fecha, tratamiento, observaciones);
                    break;

                case 3:
                    System.out.println("------ Mostrar Agenda del Día ------");
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    fecha = (Date) Teclado.leerFecha();
                    metodosBD.mostrarAgenda(fecha);
                    break;

                case 4:
                    System.out.println("------ Visitas de un Paciente ------");
                    System.out.print("DNI del paciente: ");
                    dni = Teclado.leerDNI();
                    metodosBD.mostrarVisitasPaciente(dni);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
}
