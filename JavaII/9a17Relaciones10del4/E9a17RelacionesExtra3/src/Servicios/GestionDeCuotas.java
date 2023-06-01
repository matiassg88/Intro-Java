/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Cuota;
import java.util.Date;
import java.util.Scanner;

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
public class GestionDeCuotas {
    private Scanner sc;
    private Cuota [] factura;
    private Cuota cuotaVigente;

    public GestionDeCuotas() {
        sc = new Scanner(System.in);
    }
    
    public Cuota [] crearFactura (String formaDePago, Integer totalvalorPoliza,Integer cantidadCuotas,Date vencimiento){// TODO pasar por parametro desde gestio de polizas para completar la factura
     factura=new Cuota[cantidadCuotas];
        for (int i = 0; i < cantidadCuotas; i++) {
            vencimiento.setMonth(+1);
            cuotaVigente= new Cuota(i+1, (totalvalorPoliza/cantidadCuotas), false, vencimiento, formaDePago);
            factura [i]=cuotaVigente;
        }        
        return factura;
    }
}