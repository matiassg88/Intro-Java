
package entidades;



public abstract class Empleado extends Persona {
    protected Integer anioDeIngreso;
    protected Integer numDespacho;

    public Empleado() {
    }

    public Empleado(Integer anioDeIngreso, Integer numDespacho, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
        this.anioDeIngreso = anioDeIngreso;
        this.numDespacho = numDespacho;
    }

    public Integer getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(Integer anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    public Integer getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(Integer numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    public abstract void reasignacionDespacho();
}
