/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unaX;

/**
 *
 * @author iker
 */
import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la X: ");
        int size = scanner.nextInt();

        // Crear el array bidimensional para almacenar la X
        char[][] x = new char[size][size];

        // Rellenar la X con asteriscos
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - 1 - j) {
                    x[i][j] = '*';
                } else {
                    x[i][j] = ' ';
                }
            }
        }

        // Mostrar la X por pantalla
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}

