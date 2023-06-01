/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    protected String resolucion;
    protected boolean sintonizadorTDT;
    private Scanner sc;

    public Televisor() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Televisor(String resolucion, boolean sintonizadorTDT,String color, char consumoE, String peso) {
        super( color, consumoE, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        
    }

  

  

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public String getPrecio() {
        return precio;
    }

  

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public void crearTelevisor (){
        System.out.println("Ingrese color de la tele: ");
        String colorT=sc.nextLine();
        System.out.println("Ingrese tipo de consumo de la tele: ");
        char consumoET=sc.next().charAt(0);
        System.out.println("Ingrese peso de la tele: ");
        String pesoT=sc.nextLine();
        crearElectrodomestico(colorT, consumoET, pesoT);
        System.out.println("Ingrese la resolucion en pulgadas:");
        this.resolucion=sc.next();
        System.out.println("TDT true (si) false (no)");
        boolean TDT= sc.nextBoolean();
    }
    
  
    public void precioFinalTele(char consumo, String peso) {
        precioFinal(consumo, peso);
        
        if (Integer.valueOf(resolucion)>40&& sintonizadorTDT ==true) {
            Integer precioMayorA40=(int)(Integer.valueOf(super.getPrecio())*0.7);
            String precioNuevo=String.valueOf(Integer.valueOf(super.getPrecio())+500+precioMayorA40);
            super.setPrecio(precioNuevo);
        }else if (sintonizadorTDT==true) {
            String precioNuevo=String.valueOf(Integer.valueOf(super.getPrecio())+500);
            super.setPrecio(precioNuevo);
        }else if (Integer.valueOf(resolucion)>40) {
            Integer precioMayorA40=(int)(Integer.valueOf(super.getPrecio())*0.7);
            String precioNuevo=String.valueOf(Integer.valueOf(super.getPrecio())+precioMayorA40);
            super.setPrecio(precioNuevo);            
        }
    } 

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT  + ", precio=" + precio + ", color=" + color + ", consumoE=" + consumoE + ", peso=" + peso+'}';
    }
    
}
