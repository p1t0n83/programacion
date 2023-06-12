/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja2colecciones;

import java.util.Scanner;

/**
 *
 * @author daw106
 */
public class Curso {
    private int codigo;
    private String descripcion;
    private int nHoras;

    public Curso() {
        System.out.println("Codigo");
        codigo=new Scanner(System.in).nextInt();
        System.out.println("Descripcion:");
        descripcion=new Scanner(System.in).nextLine();
        System.out.println("Horas totales:");
        nHoras=new Scanner(System.in).nextInt();
    }
    
    public Curso(int codigo, String descripcion, int nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
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

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }
    
    
    
}
