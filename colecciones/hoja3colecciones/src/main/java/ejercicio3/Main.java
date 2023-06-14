/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author iker
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente(001, "Juan", "Perez");
        banco.insertar(cliente1);

        Cliente cliente2 = new Cliente(02, "María", "López");
        banco.insertar(cliente2);

        Cliente cliente3 = new Cliente(003, "Pedro", "González");
        banco.insertar(cliente3);

        Cliente cliente4 = new Cliente(004, "Ana", "Martínez");
        banco.insertar(cliente4);

        System.out.println("Clientes del banco:");
        

      
    }
}

