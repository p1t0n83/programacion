/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja2colecciones;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author daw106
 */
public class Academia {
    private LinkedList<Curso> cursos=new LinkedList<>();
    
    
    public void aniadirFinal(Curso c){
        cursos.addLast(c);
    }
    
    public void aniadir(Curso c){
        cursos.add(c);
    }
    
    public void borrarCodigo(int c){
        for (Curso curso : cursos) {
            if(curso.getCodigo()==c){
                cursos.remove(curso);
            }
        }
    }
     public void modificarCodigo(int c){
        for (Curso curso : cursos) {
            if(curso.getCodigo()==c){
                System.out.println("Nuevo codigo:");
                int c2=new Scanner(System.in).nextInt();
                curso.setCodigo(c2);
            }
        }
    }
}

