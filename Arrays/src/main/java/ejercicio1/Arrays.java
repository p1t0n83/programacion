/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1;

/**
 *
 * @author daw106
 */
public class Arrays {

    public static void main(String[] args) {
        Array a= new Array();
      
        a.introducir();
        a.mostrar();
        
        a.rotarDerecha();
        a.mostrar();
        int[] b=new int[10];
        
        a.comparar(b);
    }
}
