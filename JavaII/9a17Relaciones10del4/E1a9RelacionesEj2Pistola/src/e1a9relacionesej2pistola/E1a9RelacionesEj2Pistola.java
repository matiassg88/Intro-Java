/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1a9relacionesej2pistola;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;


public class E1a9RelacionesEj2Pistola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        //se declaran variables
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Jugador creaRonda;
        Juego inicio = new Juego ();
        RevolverDeAgua r = new RevolverDeAgua();
        
        String res;
        //bucle para jugar y preguntar si se quiere seguir
        do {
        ArrayList <Jugador> jugadores = new ArrayList<>();//creando dentro del bucle al iterar vuelve a cero.
        System.out.println("ingrese la cantidad de jugadores: ");
        Integer cantidad = sc.nextInt();
        creaRonda = new Jugador(cantidad);
        Integer aux=creaRonda.getId();/*de poner la variable cantidad en caso 
                                        de ser un numero mayor a 6 va a iterar 
                                        mas veces de lo permitido por la cantidad maxima de jugadores
                                       */
        for (int i = 0; i < aux; i++) {
            creaRonda=new Jugador(i+1);
            jugadores.add(creaRonda);
        }
        
        r.llenarRevolver();
        
        inicio.llenarJuego(jugadores, r);
        inicio.ronda();
            System.out.println("jugar de nuevo? si/no");
            res = sc.next();
            
        } while (res.equalsIgnoreCase("si"));
    }
}
