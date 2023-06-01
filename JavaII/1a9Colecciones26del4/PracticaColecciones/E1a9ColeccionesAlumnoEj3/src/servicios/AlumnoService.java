/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class AlumnoService {
    private Scanner sc = new Scanner(System.in);//.useDelimiter("\n");
    private ArrayList <Alumno> listaAlumno=new ArrayList();

    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }
    
   
    
    public void crearAlumno (){
        Alumno al = new Alumno ();
        ArrayList <Integer> notas=new ArrayList ();//esta variable debí hacerla local porque de lo contrario se concatena con la de la clase Alumno.
        System.out.println("Ingrese nombre del alumno");
        al.setAlumno(sc.nextLine());
        
        for (int i = 0; i < 3; i++) {
        System.out.println("Ingrese tres notas: ");
        System.out.println("nota "+(i+1));
        int nota = sc.nextInt();
        notas.add(nota);    
        }
        
        sc.nextLine();
        
        al.setNotas(notas);
        
        listaAlumno.add(new Alumno(al.getAlumno(), al.getNotas()));
        //notas=null;
        System.out.println(listaAlumno.toString()+""+listaAlumno.size());
        //notas.removeAll(notas);
    }
    public double notaFinal(String nombre, int num){
        double prom=0;
        for (int i = 0; i < 3; i++) {
            prom+=listaAlumno.get(num).getNotas().get(i);
        }
       return prom=prom/3;
    }
}
