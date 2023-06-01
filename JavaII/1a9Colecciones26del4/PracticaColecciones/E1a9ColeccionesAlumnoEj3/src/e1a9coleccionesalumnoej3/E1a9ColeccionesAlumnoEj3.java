/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1a9coleccionesalumnoej3;

import java.util.Scanner;
import servicios.AlumnoService;

/**
 *
 * @author Aldana Hereñu
 */
public class E1a9ColeccionesAlumnoEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlumnoService nuevo = new AlumnoService();
        int a=2;        
        for (int i = 0; i < a; i++) {
        nuevo.crearAlumno();    
            System.out.println(" ¿desea ingresar otro? s/n");
            char res=sc.next().charAt(0);
            sc.nextLine();
            if (res=='n') {
                break;
            }else if (res=='s') {
                a++;
                continue;
            }else System.out.println("reinicie el programa "); break;
        }
        
        
        System.out.println("Ingrese el nombre del alumno para calcular su nota final.");
        String nombre=sc.nextLine();
        double promedio=0;
        for (int i = 0; i < nuevo.getListaAlumno().size() ; i++) {
            if (nuevo.getListaAlumno().get(i).getAlumno().equalsIgnoreCase(nombre)){
              promedio=nuevo.notaFinal(nombre,i);
            }
        }
        System.out.println("La nota promedio del alumno "+nombre+" es de: "+promedio);
    }
    
}
