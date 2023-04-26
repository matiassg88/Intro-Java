/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e25a32ej6vectores;

import entidades.Curso;
import java.util.Scanner;
import servicios.CursoServicio;

/**
 *
 * @author Aldana Hereñu
 */
public class E25a32ej6Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String [] alumnos1=new String[5];
        Curso cursoA = new Curso();
        CursoServicio curso1=new CursoServicio();
        
        //curso1.cargarAlumnos(cursoA,alumnos1,sc);
        curso1.crearCurso(sc,alumnos1,cursoA);
        curso1.calcularGananciaSemanal(cursoA);
    }
    
}
