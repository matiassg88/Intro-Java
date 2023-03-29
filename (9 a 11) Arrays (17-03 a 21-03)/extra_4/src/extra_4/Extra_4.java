/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_4;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Los profesores del curso de programación de Egg 
        necesitan llevar un registro de las notas adquiridas
        por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
        Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos 
        evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
        Al final del programa los profesores necesitan obtener por pantalla la 
        cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban 
        los alumnos con promedio mayor o igual al 7 de sus notas del curso.
        */
        Scanner sc = new Scanner (System.in);
        int tp;
        int tpe;
        int int1;
        int int2;
        float prom;
               
        int []alumnos = new int [10];//en cada indice se guarda la nota ya promediada
        int apro=0;
        int desa=0;
            for (int i = 0; i < 10; i++) {    
            tp = (int) (Math.random()*11+1);
            tpe =(int) (Math.random()*11)+1;
            int1 =(int) (Math.random()*11+1);
            int2 =(int) (Math.random()*11+1);
            prom = (float)((tp*0.1)+(tpe*0.25)+(int1*0.25)+(int2*0.50))/4;
            alumnos[i]=(int)prom;
            if (alumnos[i]<=6){
            desa++;}else apro++;
        }
            System.out.println("aprobados: "+apro+"\nDesaprobados: "+desa);
        
    }
    
}
