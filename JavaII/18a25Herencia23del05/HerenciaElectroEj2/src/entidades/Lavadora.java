/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Lavadora extends Electrodomestico{
    
    protected String carga;
    private Scanner sc;
    public Lavadora() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Lavadora(String color, char consumoE, String peso, String carga) {
        super(color, consumoE, peso);
        this.carga = carga;
    }

    

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
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
  
    public void crearLavadora (){
        System.out.println("Ingrese color de la lavadora: ");
        String colorL=sc.nextLine();
        System.out.println("Ingrese tipo de consumo de la lavadora: ");
        char consumoEL=sc.next().charAt(0);
        System.out.println("Ingrese peso de la lavadora: ");
        String pesoL=sc.nextLine();
        crearElectrodomestico(colorL, consumoEL, pesoL);
        System.out.println("Ingrese carga de la lavadora:");
        this.carga=sc.next();
        
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */

    
    public void precioFinalLavadora(char consumo, String peso) {
        precioFinal(consumo, peso);
        if (Integer.valueOf(carga)>30) {
            String precioNuevo=String.valueOf(Integer.valueOf(super.getPrecio())+500);
            super.setPrecio(precioNuevo);
        }
    } 

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + ", precio=" + precio + ", color=" + color + ", consumoE=" + consumoE + ", peso=" + peso+'}';
    }

   
}
