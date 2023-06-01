/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Coberturas;
import entidades.Cuota;
import entidades.Poliza;
import java.util.Date;
import java.util.Scanner;

/**
 *
 *Gestión de Pólizas(servicio): Se registrará una póliza(entidad), donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). 
 */
public class GestionDePolizas {

    private Poliza nuevaPoliza;
    private Scanner sc;
    private Date desde;
    private Date hasta;
    private GestionDeCuotas cuotas;
    //private ServicioCoberturas servicioCoberturas;
    private Coberturas cobertura;
    private Coberturas [] coberturaVector;
    
    public GestionDePolizas() {
        cuotas = new GestionDeCuotas();
        coberturaVector = new Coberturas [3];
        cobertura = new Coberturas();
        desde = new Date();
        hasta = new Date();
        sc = new Scanner(System.in).useDelimiter("\n");
        
    this.coberturaVector[0]=new Coberturas("Cobertura de Colisión", "Cobertura para daños al vehículo propio en caso de colisión", 10000, 5000);
    this.coberturaVector[1]=new Coberturas("Cobertura Integral", "Cobertura amplia que incluye colisión, robo, vandalismo, incendio, etc.", 15000, 5000);
    this.coberturaVector[2]=new Coberturas("Responsabilidad Civil", "Cobertura para daños a terceros en caso de accidente", 100000, 5000);
    }

    public Poliza llenarPoliza() {
        System.out.println("Llenar póliza.");
        System.out.println("Tipo de cobretura: " + coberturaVector.toString());
        System.out.println("Elija un tipo \n1-Cobertura de Colisión. \n2-Cobertura Integral. \n3-Responsabilidad Civil.");
        int tipoCobertura = sc.nextInt();
        System.out.println("Número de Poliza: ");
        Integer nPoliza = sc.nextInt();
        System.out.println("vigencia.\nDesde: ");
        System.out.println("mes (XX):");
        desde.setMonth(sc.nextInt());
        System.out.println("año: ");
        desde.setYear(sc.nextInt() - 1900);
        System.out.println("Hasta: ");
        System.out.println("mes (XX):");
        hasta.setMonth(sc.nextInt());
        System.out.println("año: ");
        hasta.setYear(sc.nextInt() - 1900);
        System.out.println("Cantidad de cuotas: ");
        Integer cantidadCuotas = sc.nextInt();
        System.out.println("Forma de pago: ");
        String formaPago = sc.next();
        System.out.println("Total asegurado: ");
        Integer totalAsegurado = sc.nextInt();
        System.out.println("Granizo: true(si)/false(no)");
        boolean granizo = sc.nextBoolean();
        Integer montoMaximo = 0;
        if (granizo == true) {
            System.out.println("Monto máximo de granizo: ");
            montoMaximo = sc.nextInt();
        }
        cobertura = coberturaVector[tipoCobertura-1];
        Integer valorPoliza;
        if (granizo == true) {
            valorPoliza = coberturaVector[tipoCobertura-1].getValor() + coberturaVector[tipoCobertura-1].getValorGranizo();
        } else {
            valorPoliza = coberturaVector[tipoCobertura-1].getValor();
        }

        return new Poliza(nPoliza, desde, hasta, cantidadCuotas, formaPago, totalAsegurado, granizo, montoMaximo,
                cobertura, cuotas.crearFactura(formaPago, valorPoliza, cantidadCuotas, desde));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GestionDePolizas{");
        sb.append("coberturaVector=").append(coberturaVector);
        sb.append('}');
        return sb.toString();
    }
    
}
