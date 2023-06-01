
package entidades;


public class Jugador {
    private String nombre;
    private String apellido;
    private String pos;
    private byte numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String pos, byte numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pos = pos;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPos() {
        return pos;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", pos=" + pos + ", numero=" + numero + '}';
    }
    
}
