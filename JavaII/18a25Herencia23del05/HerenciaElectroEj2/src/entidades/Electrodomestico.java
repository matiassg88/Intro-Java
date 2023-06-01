/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Electrodomestico {
    protected String precio="1000";
    protected String color;
    protected char consumoE;
    protected String peso;
    
    public Electrodomestico() {
        
    }
    
    public Electrodomestico( String color, char consumoE, String peso) {
        
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
        comprobarConsumo(consumoE);
        comprobarColor(color);
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumoE;
    }

    public void setConsumo(char consumoE) {
        this.consumoE = consumoE;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    private void comprobarConsumo (char letra){
        if (letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E') {
            this.consumoE=letra;
        }else this.consumoE='F';
    }

    private void comprobarColor (String color){
        if (color.equalsIgnoreCase("gris")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("negro")) {
            this.color=color;
        }else this.color="Blanco";
    }
   
    public void crearElectrodomestico(String color, char consumoE, String peso){
         this.precio = "1000";
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
        comprobarConsumo(consumoE);
        comprobarColor(color);
    }
    
    public void precioFinal (char consumo,String peso){ 
        switch (consumo) {
            case 'A':
                if (Integer.valueOf(peso)>=1||Integer.valueOf(peso)<=19) {
                    Integer aux = Integer.valueOf(getPrecio())+1100;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=20||Integer.valueOf(peso)<=49) {
                    Integer aux = Integer.valueOf(getPrecio())+1500;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=50||Integer.valueOf(peso)<=79) {
                    Integer aux = Integer.valueOf(getPrecio())+1800;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=80) {
                    Integer aux = Integer.valueOf(getPrecio())+2000;
                    this.precio=String.valueOf(aux);
                }
                break;
            case 'B':
                 if (Integer.valueOf(peso)>=1||Integer.valueOf(peso)<=19) {
                    Integer aux = Integer.valueOf(getPrecio())+900;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=20||Integer.valueOf(peso)<=49) {
                    Integer aux = Integer.valueOf(getPrecio())+1300;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=50||Integer.valueOf(peso)<=79) {
                    Integer aux = Integer.valueOf(getPrecio())+1600;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=80) {
                    Integer aux = Integer.valueOf(getPrecio())+1800;
                    this.precio=String.valueOf(aux);
                }
                break;
            case 'C':
                 if (Integer.valueOf(peso)>=1||Integer.valueOf(peso)<=19) {
                    Integer aux = Integer.valueOf(getPrecio())+700;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=20||Integer.valueOf(peso)<=49) {
                    Integer aux = Integer.valueOf(getPrecio())+1100;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=50||Integer.valueOf(peso)<=79) {
                    Integer aux = Integer.valueOf(getPrecio())+1400;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=80) {
                    Integer aux = Integer.valueOf(getPrecio())+1600;
                    this.precio=String.valueOf(aux);
                }
                break;
            case 'D':
                 if (Integer.valueOf(peso)>=1||Integer.valueOf(peso)<=19) {
                    Integer aux = Integer.valueOf(getPrecio())+600;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=20||Integer.valueOf(peso)<=49) {
                    Integer aux = Integer.valueOf(getPrecio())+1000;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=50||Integer.valueOf(peso)<=79) {
                    Integer aux = Integer.valueOf(getPrecio())+1300;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=80) {
                    Integer aux = Integer.valueOf(getPrecio())+1500;
                    this.precio=String.valueOf(aux);
                }
                break;
            case 'E':
                 if (Integer.valueOf(peso)>=1||Integer.valueOf(peso)<=19) {
                    Integer aux = Integer.valueOf(getPrecio())+400;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=20||Integer.valueOf(peso)<=49) {
                    Integer aux = Integer.valueOf(getPrecio())+800;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=50||Integer.valueOf(peso)<=79) {
                    Integer aux = Integer.valueOf(getPrecio())+1100;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=80) {
                    Integer aux = Integer.valueOf(getPrecio())+1300;
                    this.precio=String.valueOf(aux);
                }
                break;
            case 'F':
                 if (Integer.valueOf(peso)>=1||Integer.valueOf(peso)<=19) {
                    Integer aux = Integer.valueOf(getPrecio())+200;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=20||Integer.valueOf(peso)<=49) {
                    Integer aux = Integer.valueOf(getPrecio())+600;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=50||Integer.valueOf(peso)<=79) {
                    Integer aux = Integer.valueOf(getPrecio())+900;
                    this.precio=String.valueOf(aux);
                }else if (Integer.valueOf(peso)>=80) {
                    Integer aux = Integer.valueOf(getPrecio())+1100;
                    this.precio=String.valueOf(aux);
                }
                break;
            
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoE=" + consumoE + ", peso=" + peso + '}';
    }
    
}
