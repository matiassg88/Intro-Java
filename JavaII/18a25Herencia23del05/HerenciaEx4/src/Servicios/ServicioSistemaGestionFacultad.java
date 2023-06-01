
package Servicios;

import entidades.Docente;
import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalDeServicio;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;


public class ServicioSistemaGestionFacultad {
    private Scanner sc;
    private HashMap<Integer,Persona> listaEstudiantes;
    private HashMap<Integer,Persona> listaDocentes;
    private HashMap<Integer,Persona> listaPersonalServicios;

    public ServicioSistemaGestionFacultad() {
        sc = new Scanner(System.in).useDelimiter("\n");
        listaEstudiantes = new HashMap<>();
        listaDocentes = new HashMap<>();
        listaPersonalServicios = new HashMap<>();
    }

    public ServicioSistemaGestionFacultad(HashMap<Integer, Persona> listaEstudiantes, HashMap<Integer, Persona> listaDocentes, HashMap<Integer, Persona> listaPersonalServicios) {
        this.listaEstudiantes = listaEstudiantes;
        this.listaDocentes = listaDocentes;
        this.listaPersonalServicios = listaPersonalServicios;
        sc = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    
    private Estudiante nuevoEstudiante(){
        System.out.println("Nombre: ");
        String nombre=sc.next();
        System.out.println("Apellido: ");
        String apellido = sc.next();
        System.out.println("DNI: ");
        Integer DNI=sc.nextInt();
        System.out.println("Estado civil: ");
        String estadoCivil=sc.next();
        System.out.println("Matricula: ");
        String matricula=sc.next();
        
        return new Estudiante(matricula, nombre, apellido, DNI, estadoCivil);
    }
    
    private Docente nuevoDocente(){
        System.out.println("Nombre: ");
        String nombre=sc.next();
        System.out.println("Apellido: ");
        String apellido = sc.next();
        System.out.println("DNI: ");
        Integer DNI=sc.nextInt();
        System.out.println("Estado civil: ");
        String estadoCivil=sc.next();
        System.out.println("Departamento: ");
        String departamento=sc.next();
        System.out.println("Año de ingreso AAAA: ");
        int anioDeIngreso = sc.nextInt();
        System.out.println("Numero de despacho: ");
        int despacho=sc.nextInt();
        
        return new Docente(departamento, anioDeIngreso, despacho, nombre, apellido, DNI, estadoCivil);
    }
    
    private PersonalDeServicio nuevoPersonalServicio(){
        System.out.println("Nombre: ");
        String nombre=sc.next();
        System.out.println("Apellido: ");
        String apellido = sc.next();
        System.out.println("DNI: ");
        Integer DNI=sc.nextInt();
        System.out.println("Estado civil: ");
        String estadoCivil=sc.next();
        System.out.println("Sección: ");
        String seccion=sc.next();
        System.out.println("Año de ingreso AAAA: ");
        int anioDeIngreso = sc.nextInt();
        System.out.println("Numero de despacho: ");
        int despacho=sc.nextInt();
        
        return new PersonalDeServicio(seccion, anioDeIngreso, despacho, nombre, apellido, DNI, estadoCivil);
    }
    
    public void menuPrincipal(){
        
        int num;
        do {
            System.out.println("\t¿Que desea hacer?"
                    + "\n1.Ingresar estudiante."
                    + "\n2.Ingresar docente."
                    + "\n3.Ingresar personal de servicio."
                    + "\n4.Modificar Datos personales."
                    + "\n5.Ver listas."
                    + "\n0.Salir.");
            num=sc.nextInt();
            switch (num) {
            case 1:
                Estudiante nuevoE=nuevoEstudiante();
                listaEstudiantes.put(nuevoE.getDNI(), nuevoE);
                break;
            case 2:
                Docente nuevoD=nuevoDocente();
                listaDocentes.put(nuevoD.getDNI(), nuevoD);
                break;
            case 3:
                PersonalDeServicio nuevoPS=nuevoPersonalServicio();
                listaPersonalServicios.put(nuevoPS.getDNI(), nuevoPS);
                break;
            case 4:
                do {
                    System.out.println("\tModificar Datos."
                            + "\n1.Estudiantes."
                            + "\n2.Docentes."
                            + "\n3.Personal de Servicios."
                            + "\n0.Menú anterior.");
                int num2=sc.nextInt();
                switch (num2) {
                    case 1:modificarDatosEstudiantes();
                        break;
                    case 2:modificarDatosDocentes();
                        break;
                    case 3:modificarDatosPersonalServicio();
                        break;
                    case 0:                        
                        continue;
                }

                } while (num>=1&&num<=3);
                
                break;
            case 5:
                mostrarListas();
                break;
//            case 0:
//                continue;            
        }
        } while (num>=1&&num<=5);

        
    }
    
    private void mostrarListas (){
        int num;
        do {
        System.out.println("\t¿Que listas desea ver?"
                + "\n1.Estudiantes."
                + "\n2.Docentes."
                + "\n3.Personal de Servicio."
                + "\n0.Menú principal.");
        num=sc.nextInt();
        
            switch (num) {
                case 1:
                    for (Map.Entry<Integer, Persona> entry : listaEstudiantes.entrySet()) {
                        Object key = entry.getKey();
                        Object val = entry.getValue();
                        System.out.println("**************************");
                        System.out.println(val.toString());
                        
                    }
                    break;
                case 2:
                    for (Map.Entry<Integer, Persona> entry : listaDocentes.entrySet()) {
                        Object key = entry.getKey();
                        Object val = entry.getValue();
                        System.out.println("**************************");
                        System.out.println(val.toString());
                    }
                    break;
                case 3:
                    for (Map.Entry<Integer, Persona> entry : listaPersonalServicios.entrySet()) {
                        Object key = entry.getKey();
                        Object val = entry.getValue();
                        System.out.println("**************************");
                        System.out.println(val.toString());
                    }
                    break;                    
//                    menuPrincipal();
                       
                }
            
        } while (num>=1&&num<=3);
        
    }
    
    private void modificarDatosEstudiantes(){
        int num;
        int dni;
        do {
        System.out.println("¿Qué dato desea modificar?"
                + "\n1.Estado Civil."
                + "\n2.Nuevo Curso."
                + "\n0.Menú anterior.");
        num=sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Ingrese DNI: ");
                    dni=sc.nextInt();
                    listaEstudiantes.get(dni).cambioEstadoCivil();
                    break;
                case 2:
                    System.out.println("Ingrese DNI: ");
                    dni=sc.nextInt();
                    Estudiante object = (Estudiante) listaEstudiantes.get(dni);
                        object.matriculacionNuevoCurso(); 
                        listaEstudiantes.replace(dni, object);
                    break;
                
            }
//            if (num==0) {
//                continue;
//            }
        } while (num>=1&&num<=2);
        
        
    }
    private void modificarDatosDocentes(){
         int num;
        int dni;
        do {
        System.out.println("¿\tQué dato desea modificar?"
                + "\n1.Cambio de departamento."
                + "\n2.Reasignar despacho."
                + "\n0.Menú anterior.");
        num=sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Ingrese DNI: ");
                    dni=sc.nextInt();
                    Docente object = (Docente) listaDocentes.get(dni);
                        object.cambioDeDepto(); 
                        listaDocentes.replace(dni, object);
                    break;
                case 2:
                    System.out.println("Ingrese DNI: ");
                    dni=sc.nextInt();
                    Docente object2 = (Docente) listaDocentes.get(dni);
                        object2.reasignacionDespacho();  
                        listaDocentes.replace(dni, object2);
                    break;
//                case 0:
//                    continue;
            }
        } while (num>=1&&num<=2);
        
    }
    private void modificarDatosPersonalServicio(){
         int num;
        int dni;
        do {
        System.out.println("""
                           \t\u00bfQu\u00e9 dato desea modificar?
                           1.Cambio de secci\u00f3n.
                           2.Reasignar despacho.
                           0.Men\u00fa anterior.""");
        num=sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Ingrese DNI: ");
                    //TODO logica que verifique que el dni es correcto antes llamar al metodo traslado de seccion.
                    dni=sc.nextInt(); 
                    PersonalDeServicio object = (PersonalDeServicio) listaPersonalServicios.get(dni);
                        object.trasladoDeSeccion(); 
                        listaPersonalServicios.replace(dni, object);
                    break;
                case 2:
                    System.out.println("Ingrese DNI: ");
                    dni=sc.nextInt();
                     PersonalDeServicio object2 = (PersonalDeServicio) listaPersonalServicios.get(dni);
                        object2.reasignacionDespacho();  
                        listaDocentes.replace(dni, object2);
                    break;
                
            }
//            if (num==0) {
//               continue;
//            }
        } while (num>=1&&num<=2);
        
    }
}
