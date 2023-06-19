/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopaLetras;

/**
 *
 * @author iker
 */
import java.util.Random;

public class SopaDeLetras {
    public static void main(String[] args) {
        char[][] sopa = generarSopaDeLetras(10, 10);
        mostrarSopaDeLetras(sopa);
    }

    public static char[][] generarSopaDeLetras(int filas, int columnas) {
        char[][] sopa = new char[filas][columnas];
        Random random = new Random();

        // Inicializar la matriz con caracteres aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sopa[i][j] = (char) (random.nextInt(26) + 'A'); // Caracteres de la A a la Z
            }
        }

        // Lista de palabras
        String[] palabras = {"JAVA", "PROGRAMACION", "SOPA", "LETRAS", "EJEMPLO"};

        // Insertar las palabras en la matriz en direcciones horizontales y verticales
        for (String palabra : palabras) {
            int direccion = random.nextInt(2); // 0: horizontal, 1: vertical
            int filaInicial = random.nextInt(filas);
            int columnaInicial = random.nextInt(columnas);
            int fila = filaInicial;
            int columna = columnaInicial;
            boolean sePuedeInsertar = true;

            // Verificar si se puede insertar la palabra en la dirección seleccionada
            for (char letra : palabra.toCharArray()) {
                if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas || sopa[fila][columna] != 0) {
                    sePuedeInsertar = false;
                    break;
                }

                if (direccion == 0) {
                    columna++;
                } else {
                    fila++;
                }
            }

            // Insertar la palabra en la matriz si es posible
            if (sePuedeInsertar) {
                fila = filaInicial;
                columna = columnaInicial;
                for (char letra : palabra.toCharArray()) {
                    sopa[fila][columna] = letra;

                    if (direccion == 0) {
                        columna++;
                    } else {
                        fila++;
                    }
                }
            }
        }

        return sopa;
    }

    public static void mostrarSopaDeLetras(char[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
