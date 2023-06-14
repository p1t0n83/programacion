/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author iker
 */
public class principal {
    
    public static void main(String[] args) {
         Almacen almacén = new Almacen();

        Articulo artículo1 = new Articulo();
        almacén.insertar(artículo1);

        Articulo artículo2 = new Articulo();
        almacén.insertar(artículo2);

        Articulo artículo3 = new Articulo();
        almacén.insertar(artículo3);

        almacén.mostrar();
    }
        
}
