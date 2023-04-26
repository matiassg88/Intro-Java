/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.ParDeNumeros;

/**
 *
 * @author Aldana Hereñu
 */
public class ParDeNumerosService {
    ParDeNumeros par = new ParDeNumeros();

    /*Método mostrarValores que muestra cuáles son los dos números guardados.*/
    public void mostrarValores() {
        System.out.println("Numero1: " + par.getNum1() + "numero2: " + par.getNum2());
    }

    /*Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor*/
    public void devolverMayor() {
        if (par.getNum1() < par.getNum2()) {
            System.out.println("el numero: " + par.getNum2() + " es el mayor");
        } else {
            System.out.println("el numero: " + par.getNum1() + " es el mayor");
        }
    }
    /*Método calcularPotencia para calcular la potencia del mayor valor de la clase
    elevado al menor número. Previamente se deben redondear ambos valores.*/
    public void calcularPotencia() {
        double res;
        double num1 = Math.round(par.getNum1());
        double num2 = Math.round(par.getNum2());
        if (num1 < num2) {
            res = Math.pow(num2, num1);
            System.out.println("el resultado de la potencia de: "+num2+"^"+ num1 +" es: " + res);
        } else {
            res = Math.pow(num1, num2);
            System.out.println("el resultado de la potencia de: "+num1+"^"+ num2 +" es: " + res);
        }
    }
    /*Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
    public void calculaRaiz (){
        double res;
        double num1 = Math.abs(par.getNum1());
        double num2 = Math.abs(par.getNum2());
        if (num1 < num2) {
            res = Math.sqrt(num1);
            System.out.println("el resultado de la la raiz cuadrada de: "+num1+"es: " + res);
        } else {
            res = Math.sqrt(num2);
            System.out.println("el resultado de la la raiz cuadrada de: "+num2+"es: " + res);
        }
    }
}
