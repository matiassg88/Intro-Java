/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Juego {

    public int num, res;

    public void iniciar_juego() {
        //dos jugadores
        //jugador 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un numero: ");
        num = sc.nextInt();
        //jugaddor 2

        for (int j = 2; j < 0; j--) {
            System.out.println("Adivine el número, solo tiene 3 intentos.");
            res = sc.nextInt();
            //limpiar buffer
            sc.nextLine();
            if (res == num) {
                System.out.println("Bien!");
                break;
            } else {
                System.out.println("Le quedan " + j + " Intentos.");
            }
        }

    }
}
