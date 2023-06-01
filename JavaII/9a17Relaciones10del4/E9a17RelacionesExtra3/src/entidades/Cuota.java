/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * . Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */
public class Cuota {
    private Integer numeroCuota;
    private double valorCuota;
    private boolean cuotaSaldada;
    private Date vencimiento;
    private String formaDePago;

    public Cuota() {
    }

    public Cuota(Integer numeroCuota, double valorCuota, boolean cuotaSaldada, Date vencimiento, String formaDePago) {
        this.numeroCuota = numeroCuota;
        this.valorCuota = valorCuota;
        this.cuotaSaldada = cuotaSaldada;
        this.vencimiento = vencimiento;
        this.formaDePago = formaDePago;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public boolean isCuotaSaldada() {
        return cuotaSaldada;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public void setCuotaSaldada(boolean cuotaSaldada) {
        this.cuotaSaldada = cuotaSaldada;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", valorCuota=" + valorCuota + ", cuotaSaldada=" + cuotaSaldada + ", vencimiento=" + vencimiento + ", formaDePago=" + formaDePago + '}';
    }
    
}
