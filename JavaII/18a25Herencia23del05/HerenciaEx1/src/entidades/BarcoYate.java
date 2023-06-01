
package entidades;

import java.time.LocalDate;
/**
 *
 * @author Aldana Hereñu
 */
public class BarcoYate extends Barco{
    private int CV;
    private int cantidadCamarotes;

    public BarcoYate() {
    }

    public BarcoYate(int CV, int cantidadCamarotes, String matricula, Integer eslora, LocalDate fabricacion) {
        super(matricula, eslora, fabricacion);
        this.CV = CV;
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }
    
}
