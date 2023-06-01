/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class PerroService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList <String> razas;
    
     public PerroService() {
        razas=new ArrayList();
    }

    public void añadirRaza (){  
        razas.add(sc.nextLine());
    }
    public void mostrarLista (){
        System.out.println(razas);
    }
    /**
     * 
     * @param nombreRaza recibe el nombre que se eliminara de la lista 
     */
    public void bucarEliminar (String nombreRaza){
        
//      Esta es otra forma(mas practica a mi parecer)  
//        for (int i = 0; i < razas.size(); i++) {
//            if (razas.get(i).equalsIgnoreCase(nombreRaza)) {
//              razas.remove(i);
//           }
//       }
        
        Iterator <String> it = razas.iterator();
             
        while (it.hasNext()){
            String aux = it.next();
            if (aux.equalsIgnoreCase(nombreRaza)) {
                it.remove();
            }
        }
    }
}
