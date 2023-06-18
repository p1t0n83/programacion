/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.hoja5colecciones;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Teclado {
     public  void validarLongitud(String str) {
        try {
            int longitud = str.length();
            if (longitud < 4 || longitud > 25) {
                throw new IllegalArgumentException("El string debe tener entre 4 y 25 caracteres");
            }
            System.out.println("El string es válido");
        } catch (IllegalArgumentException e) {
            System.out.println("El string es inválido: " + e.getMessage());
        }
     }
     
     public static int validarTemporadas(int numero) {
        
        
        try {
            while (numero < 1 || numero > 15) {
                System.out.println("El número de temporadas no es válido. Debe estar entre 1 y 15 (incluidos).");
                System.out.print("Por favor, ingresa un nuevo número de temporadas: ");
                numero = new Scanner(System.in).nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al ingresar el número de temporadas.");
            numero = validarTemporadas(0);
        }
        
        return numero;
    }
     private static Scanner scanner = new Scanner(System.in);

    public static String solicitarNombre() {
        System.out.print("Ingrese el nombre de la serie: ");
        return scanner.nextLine();
    }

    public static String solicitarNacionalidad() {
        System.out.print("Ingrese la nacionalidad de la serie: ");
        return scanner.nextLine();
    }

    public static int solicitarTemporadas() {
        int temporadas;
        do {
            System.out.print("Ingrese el número de temporadas (entre 1 y 15): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();
            }
            temporadas = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
        } while (temporadas < 1 || temporadas > 15);

        return temporadas;
    }
}
