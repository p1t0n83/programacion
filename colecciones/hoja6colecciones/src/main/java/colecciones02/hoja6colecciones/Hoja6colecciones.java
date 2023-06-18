/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package colecciones02.hoja6colecciones;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Hoja6colecciones {

    public static void main(String[] args) {
        EntidadBancaria entidadBancaria = new EntidadBancaria();
        Teclado t = new Teclado();

        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Abrir una cuenta nueva");
            System.out.println("2. Ver un listado de las cuentas disponibles");
            System.out.println("3. Obtener los datos de una cuenta concreta con toda su información");
            System.out.println("4. Realizar un ingreso en una cuenta");
            System.out.println("5. Retirar efectivo de una cuenta");
            System.out.println("6. Consultar los clientes del banco de cierta edad");
            System.out.println("7. Salir de la aplicación");
            System.out.print("Seleccione una opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese 1.para cuentacorrientepersonal\n"
                            + " 2.para cuentacorrienteempresa\n"
                            + "3.para cuenta ahorro");
                    int opcion2 = new Scanner(System.in).nextInt();
                    if (opcion2 == 1) {
                       
                        System.out.println("Minimo");
                        double min=new Scanner(System.in).nextDouble();
                        System.out.println("Maximo");
                        double max=new Scanner(System.in).nextDouble();
                        System.out.println("Comision mantenimiento:");
                        double comisionMantenimiento = new Scanner(System.in).nextDouble();
                        t.validaComisionMantenimiento(comisionMantenimiento, min, max);
                        System.out.println("Autoriza prestamo si/no");
                        String auto=new Scanner(System.in).next();
                        boolean autoriza=true;
                        if(auto.equals("no")){
                            autoriza=false;
                        }
                        Persona titularr= new Persona("iker", "GARCIA", LocalDate.now());
                        CorrientePersonal cp = new CorrientePersonal(comisionMantenimiento, min, max, autoriza, titularr, opcion, "3", "e", "e");
                    }
                }

                case 2 -> {
                }

                case 3 -> {
                }

                case 4 -> {
                }

                case 5 -> {
                }

                case 6 -> {
                }

                case 7 -> {
                }

            }

            System.out.println();
        } while (opcion != 7);

    }
}
