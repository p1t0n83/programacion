/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja2bd;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Teclado {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerCadena() {
        return scanner.nextLine();
    }

    public static int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
            }
        }
    }

    public static String leerTelefono() {
        String telefono = leerCadena();
        while (!telefono.matches("\\d{9}")) {
            System.out.println("Error: Debes introducir un número de teléfono válido (9 dígitos).");
            telefono = leerCadena();
        }
        return telefono;
    }

    public static String leerDNI() {
        String dni = leerCadena();
        while (!validarDNI(dni)) {
            System.out.println("Error: Debes introducir un DNI válido.");
            dni = leerCadena();
        }
        return dni;
    }

    public static boolean validarDNI(String dni) {
        return dni.matches("\\d{8}[A-HJ-NP-TV-Z]") && letraDNIValida(dni);
    }

    private static boolean letraDNIValida(String dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dniNum = Integer.parseInt(dni.substring(0, dni.length() - 1));
        int resto = dniNum % 23;
        char letraCalculada = letras.charAt(resto);
        char letraDNI = dni.charAt(dni.length() - 1);
        return letraCalculada == letraDNI;
    }

    public static Date leerFecha() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        while (true) {
            try {
                return (Date) format.parse(leerCadena());
            } catch (Exception e) {
                System.out.println("Error: Debes introducir una fecha válida (dd/mm/yyyy).");
            }
        }
    }
}