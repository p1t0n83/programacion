/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cruz;

/**
 *
 * @author iker
 */
import java.util.Scanner;

public class Cruz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la cruz: ");
        int size = scanner.nextInt();

        // Crear el array bidimensional para almacenar la cruz
        char[][] cruz = new char[size][size];

        // Rellenar la cruz con asteriscos
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == size / 2 || j == size / 2) {
                    cruz[i][j] = '*';
                } else {
                    cruz[i][j] = ' ';
                }
            }
        }

        // Mostrar la cruz por pantalla
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(cruz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

