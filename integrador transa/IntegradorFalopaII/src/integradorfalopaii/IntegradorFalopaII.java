/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integradorfalopaii;

import Entidades.Estudiante;
import Servicios.EstudiantesService;
import java.util.Arrays;

/**
 *
 * @author Aldana Hereñu
 */
public class IntegradorFalopaII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        double prom;
        Estudiante[] clase = new Estudiante[8];
        EstudiantesService estudiantes = new EstudiantesService();
        
        //metodo que "inicializa" a los estudiantes.
        clase = estudiantes.crearEstudiantes();
        System.out.println(Arrays.toString(clase));
        
        //calcula promedio de notas
        prom = estudiantes.calcularPromedio(clase);

        /*en el caso de guardarlo en un arreglo, seria de la misma dimension que la clase
        por desconocer la cantidad de alumnos que estan por sobre el promedio, una forma de solucionarlo es hacer un arrayList o 
        crear dos metodos en servicios uno que devuelva la cantidad que superan el promedio para poder dimensionar en arreglo String 
        donde se imprimiran y guardaran los nombres.*/
       /* String[] porSobre = new String[8];
        porSobre = estudiantes.porSobrePromedio(clase, prom);*/
        
       //imprime los estudiantes que estan por sobre el promedio
        System.out.println(Arrays.toString(estudiantes.porSobrePromedio(clase, prom)));
    }
    
}
