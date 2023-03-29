/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

public class Operacion {
   private int num1;
   private int num2;

    public Operacion() {
    }//cons vacio
    public Operacion(int num1, int num2){
        }//cons con parametro
    
   public void setNum(int num1, int num2){
       this.num1=num1;
       this.num2=num2;
    }

    public int getNum1() {
        int num = this.num1;

        return num;
    }

    public int getNum2() {
        int num = this.num2;
        return num;
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public float dividir() {
        return (float)num1 / num2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
}
