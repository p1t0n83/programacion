/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Hoja4colecciones {

    public static void main(String[] args) {
        int opcion=0;
        Equipo equipo= new Equipo();
        do{
            System.out.println("1.para insertar\n"
                    + "2.para borrar un jugador\n"
                    + "3.para obtener el jugador mas bajo\n"
                    + "4.para obtener el jugador mas alto\n"
                    + "5.para obtener los jugadores de mas de dos metros\n"
                    + "6.para mostrar a todos los jugadores\n"
                    + "7.para salir");
            opcion= new Scanner(System.in).nextInt();
        switch(opcion){
            case 1->{
                System.out.println("Nombre del jugador:");
                String nombre= new Scanner(System.in).nextLine();
                System.out.println("Altura");
                double altura= new Scanner(System.in).nextDouble();
                Jugador jugador=new Jugador(nombre, altura);
                if(equipo.insertar(jugador)==true){
                    System.out.println("Se inserto con exito");
                }else{
                    System.out.println("Hubo un error");
                }
            }case 2->{
                System.out.println("Nombre del jugador a borrar:");
                String nombre= new Scanner(System.in).nextLine();
                System.out.println("Altura");
                Scanner teclado=new Scanner(System.in);
                double altura= teclado.nextDouble();
                Jugador jugador=new Jugador(nombre, altura);
                if(equipo.mostrarTodos()!=null){
                if(equipo.borrar(jugador)==true){
                    System.out.println("Se borro con exito");
                }else{
                    System.out.println("Hubo un error:");
                }}else{
                    System.out.println("La coleccion esta vacia");
                }
            }case 3->{
                if(equipo.masBajo().toString()!=null)
                {System.out.println("El jugador mas bajo es:");
                System.out.println(equipo.masBajo().toString());}
                else{
                    System.out.println("Esta bacio");
                }    
            }case 4->{
                if(equipo.masAlto().toString()!=null)
                {System.out.println("El jugador mas alto es:");
                System.out.println(equipo.masAlto().toString());}
                else{
                    System.out.println("Esta bacio");
                }
            }case 5->{
                System.out.println("Los jugadores de mas de 2 metros son:");
                for (Object juga : equipo.dosMetros()) {
                    System.out.println(juga.toString());
            }
            }case 6:{
                System.out.println(equipo.mostrarTodos());
            }
        }
    }while(opcion!=7);
        }
}
