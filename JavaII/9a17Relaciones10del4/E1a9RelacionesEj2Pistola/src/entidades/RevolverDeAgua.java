/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
public class RevolverDeAgua {
    private Integer posicionActual;
    private Integer posicionAgua;//bala

    public RevolverDeAgua() {
        
    }
    public void llenarRevolver (){
        this.posicionAgua=(int) Math.round(Math.random() * 6 + 1);
        this.posicionActual=(int) Math.round(Math.random() * 6 + 1);
    }
    public boolean mojar (){
        return this.posicionActual==this.posicionAgua;
    }
    public void siguienteChorro (){
        if (mojar()==false && this.posicionActual<6) {
            this.posicionActual++;
            }else if (this.posicionActual==6) {
                this.posicionActual=1;
        }
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
