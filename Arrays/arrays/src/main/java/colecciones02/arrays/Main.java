/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colecciones02.arrays;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Main {
    public static void main(String[] args) {
        Multiplicar multiplicar = new Multiplicar();
        multiplicar.multiplica();
        multiplicar.muestra();

        int[] valoresAspa = multiplicar.valoresAspa();
        System.out.println("Valores en el aspa:");
        for (int valor : valoresAspa) {
            System.out.print(valor + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de tabla de multiplicar (1-9): ");
        int numeroTabla = scanner.nextInt();

        while (numeroTabla < 1 || numeroTabla > 9) {
            System.out.print("Número inválido. Ingrese el número de tabla de multiplicar (1-9): ");
            numeroTabla = scanner.nextInt();
        }

        int[] tablaMultiplicar = multiplicar.tablaMultiplicar(numeroTabla);
        System.out.println("Tabla de multiplicar del " + numeroTabla + ":");
        for (int valor : tablaMultiplicar) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
