/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Asiento;
import entidades.Cine;
import entidades.Espectador;
import entidades.Peliculas;
import java.util.Random;

/**
 *
 * @author Aldana Hereñu
 */
public class ServicioCine {

    private Espectador[] espectador;
    private Random random = new Random();
    private Peliculas[] lista = {new Peliculas("Cinema paradiso", "Giusepe Tornatore", 300, 6), new Peliculas("El señor de los anillos", "pipo chipolatti", 500, 30), new Peliculas("matrix", "neo", 120, 18)};
    private Asiento[][] sala = new Asiento[8][6];

    public ServicioCine() {
        
        espectador = new Espectador[Math.round((int) (Math.random() * 48) + 1)];
        
        for (int i = 0; i < espectador.length; i++) {
            espectador[i] = new Espectador("Espectador " + (i + 1), random.nextBoolean(), random.nextBoolean());

        }
    }

    public void mostrarEspectador() {
        for (int i = 0; i < espectador.length; i++) {
            System.out.println(espectador[i] + " ");
        }
    }

    public void ubicar(Cine cine) {

        for (int i = 0; i < espectador.length; i++) {//recorro la gente

            if (espectador[i].isDinero() == true && espectador[i].isEdad() == true) {//comparo el bolsillo y eso
                int aux1 = Math.round((int) (Math.random() * 8));
                int aux2 = Math.round((int) (Math.random() * 6));
                
                sala = cine.getSalaUnica();//obtengo la matriz que contiene Asientos

                if (sala[aux1][aux2].isSiOcupado() == false) {
                    sala[aux1][aux2].setSiOcupado(true);//modifico un asiento.
                    cine.setSalaUnica(sala);//mando la matriz modificada a la clase Cine.
                    continue;
                }//TODO reubicar
                

                //cine.setSalaUnica(sala[aux1][aux2].setSiOcupado(true));
            }
        }
    }

    public Peliculas peliculas() {
        int aux = Math.round((int) (Math.random() * 3));
        return lista[aux];
    }
}
