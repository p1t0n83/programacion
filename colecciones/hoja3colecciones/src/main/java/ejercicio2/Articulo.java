/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Articulo implements Comparable{
    private int codigo;
    private String descripcion;
    private int existencias;

    public Articulo() {
        System.out.println("Codigo:");
        codigo= new Scanner(System.in).nextInt();
        System.out.println("Existencias:");
        existencias= new Scanner(System.in).nextInt();
        System.out.println("Descripcion:");
        descripcion= new Scanner(System.in).nextLine();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", existencias=" + existencias + '}';
    }

    
    
    
}
