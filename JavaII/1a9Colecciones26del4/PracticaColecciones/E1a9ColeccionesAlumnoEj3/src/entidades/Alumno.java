/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;


/**
 *
 * @author Aldana Hereñu
 */
public class Alumno {
    private String alumno;
    private ArrayList <Integer> notas=new ArrayList();

    public Alumno() {
        
    }

    public Alumno(String alumno, ArrayList<Integer> notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumno=" + alumno + ", notas=" + notas + '}';
    }
    
}
