/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colecciones;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author daw106
 */
public class Colecciones {

    public static void main(String[] args) { 
     ArrayList<Integer> numeros= new ArrayList<>();
        System.out.println(leeValores(numeros));
        System.out.println(calcularSuma(numeros));
        double media=calcularSuma(numeros)/numeros.size();
        mostrarResultados(numeros, calcularSuma(numeros), media);
       }
    
    
    public static ArrayList leeValores(ArrayList lista){
         int opcion=0;
          int suma=0;
           
       while(opcion!=-99){
           try{
               System.out.println("Introduce un numero, - 99 para salir:");
               opcion=new Scanner(System.in).nextInt();
               lista.add(opcion);
               suma+=opcion;
           }catch(NullPointerException npe){
               System.out.println(npe.getMessage());
           }catch(InputMismatchException ime){
               System.out.println(ime.getMessage());
           }catch(Exception e){
               System.out.println(e.getMessage());
           }
    }
       return lista;
    }
    
    public static int calcularSuma(ArrayList lista){
        int suma=0;
        Iterator <Integer> it=lista.iterator();
        while(it.hasNext()){
            suma+=it.next();
        }
        return suma;
    }
    public static void mostrarResultados(ArrayList<Integer>a,int suma,double media){
           ArrayList n= new ArrayList<>();
           for (Object object : a) {   
              n=a;
        }
        System.out.println("Suma:"+suma+", Media:"+media+", numeros superiores a la media:"+n);
    }
}

