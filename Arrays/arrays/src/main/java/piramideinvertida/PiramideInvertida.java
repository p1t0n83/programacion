/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramideinvertida;

/**
 *
 * @author iker
 */
import java.util.Scanner;

public class PiramideInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la pirámide invertida: ");
        int filas = scanner.nextInt();

        // Crear el array bidimensional para almacenar la pirámide invertida
        char[][] piramide = new char[filas][2 * filas - 1];

        // Rellenar la pirámide invertida con asteriscos
        for (int i = 0; i < filas; i++) {
            for (int j = i; j < 2 * filas - 1 - i; j++) {
                piramide[i][j] = '*';
            }
        }

        // Mostrar la pirámide invertida por pantalla
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 2 * filas - 1; j++) {
                System.out.print(piramide[i][j] + " ");
            }
            System.out.println();
        }
    }
}

