/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadradoLleno;

/**
 *
 * @author iker
 */
import java.util.Scanner;

public class CuadradoRelleno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del cuadrado: ");
        int tamaño = scanner.nextInt();

        // Crear el array bidimensional para almacenar el cuadrado
        char[][] cuadrado = new char[tamaño][tamaño];

        // Rellenar el cuadrado con asteriscos
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                cuadrado[i][j] = '*';
            }
        }

        // Mostrar el cuadrado por pantalla
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
