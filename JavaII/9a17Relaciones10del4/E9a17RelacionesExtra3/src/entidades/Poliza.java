/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.HashMap;

/**
 *
 *Gestión de Pólizas(servicio): Se registrará una póliza(entidad), donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). 
 */
public class Poliza {
    private Integer nPoliza;
    private Date vigenciaDesde;
    private Date vigenciaHasta;
    private Integer cantidadCuotas;
    private String formaDePago;
    private Integer totalAsegurado;
    private boolean granizo;
    private Integer montoMaxGranizo;
    private Coberturas tipoCobertura;
    private Cuota [] cuotas;

    public Poliza() {
    }

    public Poliza(Integer nPoliza, Date vigenciaDesde, Date vigenciaHasta, Integer cantidadCuotas, String formaDePago, Integer totalAsegurado, boolean granizo, Integer montoMaxGranizo, Coberturas tipoCobertura, Cuota[] cuotas) {
        this.nPoliza = nPoliza;
        this.vigenciaDesde = vigenciaDesde;
        this.vigenciaHasta = vigenciaHasta;
        this.cantidadCuotas = cantidadCuotas;
        this.formaDePago = formaDePago;
        this.totalAsegurado = totalAsegurado;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cuotas = cuotas;
    }

    public Integer getnPoliza() {
        return nPoliza;
    }

    public void setnPoliza(Integer nPoliza) {
        this.nPoliza = nPoliza;
    }

    public Date getVigenciaDesde() {
        return vigenciaDesde;
    }

    public void setVigenciaDesde(Date vigenciaDesde) {
        this.vigenciaDesde = vigenciaDesde;
    }

    public Date getVigenciaHasta() {
        return vigenciaHasta;
    }

    public void setVigenciaHasta(Date vigenciaHasta) {
        this.vigenciaHasta = vigenciaHasta;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Integer getTotalAsegurado() {
        return totalAsegurado;
    }

    public void setTotalAsegurado(Integer totalAsegurado) {
        this.totalAsegurado = totalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public Integer getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(Integer montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public Coberturas getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(Coberturas tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cuota[] getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuota[] cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poliza{");
        sb.append("nPoliza=").append(nPoliza);
        sb.append(", vigenciaDesde=").append(vigenciaDesde);
        sb.append(", vigenciaHasta=").append(vigenciaHasta);
        sb.append(", cantidadCuotas=").append(cantidadCuotas);
        sb.append(", formaDePago=").append(formaDePago);
        sb.append(", totalAsegurado=").append(totalAsegurado);
        sb.append(", granizo=").append(granizo);
        sb.append(", montoMaxGranizo=").append(montoMaxGranizo);
        sb.append(", tipoCobertura=").append(tipoCobertura);
        sb.append(", cuotas=").append(cuotas);
        sb.append('}');
        return sb.toString();
    }

    
}
