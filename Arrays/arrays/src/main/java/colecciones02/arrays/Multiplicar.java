/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones02.arrays;

/**
 *
 * @author iker
 */
public class Multiplicar {
    private int[][] matriz;

    public Multiplicar() {
        matriz = new int[10][10];

        // Inicializar primera fila y columna con los números del 1 al 9
        for (int i = 1; i <= 9; i++) {
            matriz[0][i] = i;
            matriz[i][0] = i;
        }
    }

    public void multiplica() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                matriz[i][j] = matriz[0][i] * matriz[j][0];
            }
        }
    }

    public void muestra() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public int[] valoresAspa() {
        int[] valores = new int[18];
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            valores[index++] = matriz[i][i];
            valores[index++] = matriz[i][9 - i];
        }

        return valores;
    }

    public int[] tablaMultiplicar(int numero) {
        int[] tabla = new int[9];

        for (int i = 1; i <= 9; i++) {
            tabla[i - 1] = matriz[numero][i];
        }

        return tabla;
    }
}
