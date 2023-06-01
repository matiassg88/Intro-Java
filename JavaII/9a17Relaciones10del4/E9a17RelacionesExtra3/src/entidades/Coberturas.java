/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Coberturas {
    private String tipoCobertura;
    private String descripcion;
    private Integer valor;
    private Integer valorGranizo;
    private Coberturas [] coberturtasVector;
    
    public Coberturas() {
            coberturtasVector=new Coberturas[3];
    }

    public Coberturas(String tipoCobertura, String descripcion, Integer valor, Integer valorGranizo) {
        this.tipoCobertura = tipoCobertura;
        this.descripcion = descripcion;
        this.valor = valor;
        this.valorGranizo = valorGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getValorGranizo() {
        return valorGranizo;
    }

    public void setValorGranizo(Integer valorGranizo) {
        this.valorGranizo = valorGranizo;
    }

    public Coberturas[] getCoberturtasVector() {
        return coberturtasVector;
    }

    public void setCoberturtasVector(Coberturas[] coberturtasVector) {
        this.coberturtasVector = coberturtasVector;
    }

    @Override
    public String toString() {
        return "Coberturas{" + "tipoCobertura=" + tipoCobertura + ", descripcion=" + descripcion + ", valor=" + valor + ", valorGranizo=" + valorGranizo + '}';
    }
     
}
