/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class CursoServicio {
    /*Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
    Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle,
    solicitando en cada repetición que se ingrese el nombre de cada alumno.
*/
    public void cargarAlumnos(Curso cursoA,String [] alumnos1,Scanner sc){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno "+i);
            alumnos1[i]=sc.nextLine();
        }
        cursoA.setAlumnos(alumnos1);
        //System.out.println(cursoA.toString());
    }
    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y 
    después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
    En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos.
*/
    public void crearCurso(Scanner sc, String[] alumnos1, Curso cursoA) {

        /*private String nombreCurso; 
    private int cantidadHorasPorDia; 
    private int cantidadDiasPorSemana; 
    private char turno; //(mañana o tarde)  
    private int precioPorHora; 
    private String[] alumnos = new String[5];*/
        System.out.println("Ingrese el nombre del curso: ");
        cursoA.setNombreCurso(sc.nextLine());
        System.out.println("Turno(caracter)T=tarde,M=mañana: ");
        cursoA.setTurno(sc.next().charAt(0));
        System.out.println("Horas por día(valor entero): ");
        cursoA.setCantidadHorasPorDia(sc.nextInt());
        System.out.println("Cantidad de días por semana: ");
        cursoA.setCantidadDiasPorSemana(sc.nextInt());
        System.out.println("Precio por hora(valor entero): ");
        cursoA.setPrecioPorHora(sc.nextInt());
        sc.nextLine();
        cargarAlumnos(cursoA, alumnos1, sc);
        System.out.println(cursoA.toString());
    }
    
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
    el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.*/
    public void calcularGananciaSemanal(Curso cursoA) {
        int ganancia=cursoA.getCantidadHorasPorDia()*5*cursoA.getCantidadDiasPorSemana()*cursoA.getPrecioPorHora();
        System.out.println("Ganancia semanal $"+ganancia);
    }
}
