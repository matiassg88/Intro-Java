
package entidades;


import java.util.Scanner;


public class Docente extends Empleado{
    private String departamento;

    public Docente() {
    }

    public Docente(String departamento, Integer anioDeIngreso, Integer numDespacho, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(anioDeIngreso, numDespacho, nombre, apellido, DNI, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void cambioEstadoCivil() {
         Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nuevo estado civil: " );
        super.estadoCivil=sc.next(); }

    @Override
    public void reasignacionDespacho() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nuevo despacho: " );
        super.numDespacho=sc.nextInt(); 
    }
    
public void cambioDeDepto(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nuevo departamento: " );
        this.departamento=sc.next(); 
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Docente{");        
        sb.append("\nnombre=").append(nombre);
        sb.append("\napellido=").append(apellido);
        sb.append("\nDNI=").append(DNI);
        sb.append("\nestado civil=").append(estadoCivil);
        sb.append("\ndepartamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }

    
    
}
