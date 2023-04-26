/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class NIFservices {
    
    Scanner sc = new Scanner(System.in);
    NIF nif =new NIF ();
    

    public void crearNif(){
        System.out.println("Ingrese dni");
        nif.setDni(sc.nextLong());
        sc.nextLine();
    }
    public void calcular (char[] letras){
        double pos=nif.getDni()%23;
        
        for (int i = 0; i < 23; i++) {
            if (i==pos) {
                nif.setLetra(letras[i]);
            }
        }
    }
    public void mostrar (){
        System.out.println(nif.getDni()+"-"+nif.getLetra());
    }
            
}
