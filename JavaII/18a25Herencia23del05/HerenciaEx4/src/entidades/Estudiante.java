
package entidades;

import java.util.Scanner;

public class Estudiante extends Persona {
    private String matricula;
    
    public Estudiante() {
        
    }

    public Estudiante(String matricula, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void cambioEstadoCivil() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nuevo estado civil: " );
        super.estadoCivil=sc.next();
        
    }
    
public void matriculacionNuevoCurso( ){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nueva matricula: " );
        this.matricula=sc.next(); 
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");        
        sb.append("\nnombre=").append(nombre);
        sb.append("\napellido=").append(apellido);
        sb.append("\nDNI=").append(DNI);
        sb.append("\nestado civil=").append(estadoCivil);
        sb.append("\nmatricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }
    
}
