/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaex4;

import Servicios.ServicioSistemaGestionFacultad;
import entidades.Docente;
import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalDeServicio;
import java.util.HashMap;



/**Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las 

• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
public class HerenciaEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     HashMap<Integer,Persona> listaEstudiantes=new HashMap<>();
     HashMap<Integer,Persona> listaDocentes=new HashMap<>();
     HashMap<Integer,Persona> listaPersonalServicios=new HashMap<>();
        // Generar objetos PersonalDeServicio
        PersonalDeServicio ps1 = new PersonalDeServicio("Sección 1", 2005, 10, "Juan", "Perez", 12345678, "Soltero/a");
        PersonalDeServicio ps2 = new PersonalDeServicio("Sección 2", 2010, 20, "María", "López", 87654321, "Casado/a");
        PersonalDeServicio ps3 = new PersonalDeServicio("Sección 3", 2015, 30, "Pedro", "González", 98765432, "Soltero/a");
        listaPersonalServicios.put(ps1.getDNI(), ps1);
        listaPersonalServicios.put(ps2.getDNI(), ps2);
        listaPersonalServicios.put(ps3.getDNI(), ps3);
        // Generar objetos Docente
        Docente d1 = new Docente("Departamento 1", 2002, 5, "Ana", "Martínez", 23456789, "Casado/a");
        Docente d2 = new Docente("Departamento 2", 2008, 15, "Luis", "Gómez", 34567890, "Soltero/a");
        Docente d3 = new Docente("Departamento 3", 2013, 25, "Laura", "Ramírez", 45678901, "Soltero/a");
        listaDocentes.put(d1.getDNI(), d1);
        listaDocentes.put(d2.getDNI(), d2);
        listaDocentes.put(d3.getDNI(), d3);
        // Generar objetos Estudiante
        Estudiante e1 = new Estudiante("2021001", "Carlos", "Sánchez", 56789012, "Soltero/a");
        Estudiante e2 = new Estudiante("2021002", "Sofía", "Hernández", 67890123, "Casado/a");
        Estudiante e3 = new Estudiante("2021003", "Andrés", "Torres", 78901234, "Soltero/a");
        listaEstudiantes.put(e1.getDNI(), e1);
        listaEstudiantes.put(e2.getDNI(), e2);
        listaEstudiantes.put(e3.getDNI(), e3);
        
        ServicioSistemaGestionFacultad nuevo = new ServicioSistemaGestionFacultad(listaEstudiantes, listaDocentes, listaPersonalServicios);
        nuevo.menuPrincipal();
    }
    
}
