/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaelectroej2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;

/**
 *
 * @author Aldana Hereñu
 */
public class HerenciaElectroEj2 {

//
//Finalmente, en el main debemos realizar lo siguiente:
//Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
//el precio final de los dos electrodomésticos.

    public static void main(String[] args) {
        Electrodomestico e1 = new Lavadora ("rojo", 'l', "80", "8");
        Electrodomestico e2 = new Televisor ("50", true, "rojo", 'B', "5");
        
        e1.precioFinal(e1.getConsumo(), e1.getPeso());
        System.out.println(e1.toString());
        
        e2.precioFinal(e2.getConsumo(), e2.getPeso());
        System.out.println(e2.toString());
        
    }
    
}
