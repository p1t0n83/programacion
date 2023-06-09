/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw106
 */
public class Array {

    private int vector[];

    public Array() {
        vector = new int[10];

    }

    public void mostrar() {
        System.out.println("Se muestran los valores del vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }

    public void introducir() {
        System.out.println("Introduce los valores del array");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce el valor" + (i + 1));
            vector[i] = new Scanner(System.in).nextInt();
        }
    }

    public int media() {
        System.out.println("Se calcula la media");
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma / vector.length;
    }

    public void modificar(int num, int pos) {
        System.out.println("Se cambia el valor de la posisicon " + pos + " por:" + num);
        if (pos <= vector.length && pos > 0) {
            vector[pos - 1] = num;
        } else {
            System.out.println("Se sale del rango");
        }
    }

    public void rotarIzquierda() {
        int primero = vector[0];
        for (int i = 1; i < vector.length; i++) {
            vector[i - 1] = vector[i];
        }
        vector[vector.length - 1] = primero;
    }

    public void rotarDerecha() {

        int ultimo = vector[vector.length - 1];
        for (int i = vector.length-1; i > 0; i--) {
            vector[i]=vector[i-1];
        }
        vector[0] = ultimo;

    }

    public void comparar(int[] a) {
        System.out.println("Se  muestran dos valores iguales");
       
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == a[i]) {
                    int num=vector[i];
                    System.out.println(num);                    
                }
            }
        
    }

    public void sumarPares() {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                suma += vector[i];
            }
        }
        System.out.println("La suma de los numeros pares:" + suma);
    }
}
