/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

public class Circunferencia {
     private double radio;
    
    public Circunferencia (){
    }
     
    public void setRadio(double rad){
        this.radio=rad;
    }
    public double getRadio(){
        double rad=this.radio;
        return rad;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
