/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Estudiante;
import java.text.DecimalFormat;

/**
 *
 * @author Aldana Hereñu
 */
public class EstudiantesService {

    public Estudiante[] crearEstudiantes() {
        
        Estudiante e1 = new Estudiante("Tata", 3.3);
        Estudiante e2 = new Estudiante("Tete", 4.2);
        Estudiante e3 = new Estudiante("Titi", 5.1);
        Estudiante e4 = new Estudiante("Toto", 6.3);
        Estudiante e5 = new Estudiante("Tutu", 7.2);
        Estudiante e6 = new Estudiante("Tate", 9);
        Estudiante e7 = new Estudiante("Tito", 10);
        Estudiante e8 = new Estudiante("Tuta", 9.3);
        
        
        return new Estudiante [] {e1,e2,e3,e4,e5,e6,e7,e8};
        
    }
    
    public double calcularPromedio(Estudiante [] clase){
        DecimalFormat df = new DecimalFormat("#.0");
        double prom=0;
        for (int i = 0; i < clase.length; i++) {
        prom += clase [i].getNota();    
        }
        System.out.println("El promedio de la clase es: "+df.format(prom/clase.length));
        return prom/clase.length;
    }
    
    public String[] porSobrePromedio (Estudiante [] clase, double prom){
            int num=0;
        for (int i = 0; i < clase.length; i++) {
            if (clase[i].getNota()>prom) {
                num++;
            }
        }
        int j=0;
        String [] porSobre = new String[num];
        for (int i = 0; i < clase.length; i++) {
            if (clase[i].getNota()>prom) {
                porSobre[j]=clase[i].getNombre();
                j++;
            }
        }
        return porSobre;        
    }
    
}
