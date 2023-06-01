/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;



public class Juego {
    private ArrayList <Jugador> jugadores;
    private RevolverDeAgua r;

    public Juego() {
    jugadores = new ArrayList <> ();
    }
        
    public void llenarJuego(ArrayList jugadores, RevolverDeAgua r){
        this.jugadores=jugadores;
        this.r=r;        
    }
    public void ronda (){
        do {
        for (Jugador jugador : jugadores) {
            if (jugador.disparo(this.r)==true) {
                System.out.println(jugador.toString());
                break;
            }else this.r.siguienteChorro();
        }    
        } while (r.mojar()==false);//hasta que salga el chorro
        
    }
            
}
