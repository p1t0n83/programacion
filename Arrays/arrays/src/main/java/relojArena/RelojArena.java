/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojArena;

/**
 *
 * @author iker
 */
import java.util.Scanner;

public class RelojArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas del reloj de arena: ");
        int filas = scanner.nextInt();

        // Crear el array bidimensional para almacenar el reloj de arena
        char[][] reloj = new char[filas][filas];

        // Rellenar el reloj de arena con asteriscos
        for (int i = 0; i < filas; i++) {
            for (int j = i; j < filas - i; j++) {
                reloj[i][j] = '*';
                reloj[filas - 1 - i][j] = '*';
            }
        }

        // Mostrar el reloj de arena por pantalla
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(reloj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
