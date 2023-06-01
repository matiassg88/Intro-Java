
package entidades;


import java.util.Scanner;

public class PersonalDeServicio extends Empleado{
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, Integer anioDeIngreso, Integer numDespacho, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(anioDeIngreso, numDespacho, nombre, apellido, DNI, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
    
public void trasladoDeSeccion(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nueva sección: " );
        this.seccion=sc.next(); 
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonalDeServicio{");        
        sb.append("\nnombre=").append(nombre);
        sb.append("\napellido=").append(apellido);
        sb.append("\nDNI=").append(DNI);
        sb.append("\nestado civil=").append(estadoCivil);
        sb.append("\nseccion=").append(seccion);
        sb.append('}');
        return sb.toString();
    }
    
}
