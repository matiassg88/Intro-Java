/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;



public class AhorcadoService {
    
    public void crearJuego(Scanner sc, Ahorcado datos){
        System.out.println("Ingrese la palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        int life = sc.nextInt();
        sc.nextLine();
        ArrayList<String> ahorcado=new ArrayList<String>();
        
        for (int i = 0; i < palabra.length() ; i++) {
            ahorcado.add(palabra.substring(i, i+1).toUpperCase());
        }
        datos.setJugadas(life);
        datos.setAhorcado(ahorcado);
        
         //for para jugar simulando una limpieza del la pantalla de salida.
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
    public void longitud(Ahorcado datos){        
        System.out.println("La palabra contiene "+datos.getAhorcado().size()+" letras.");
    }
    
    public void buscar(String letra, Ahorcado datos) {
        int aux = 0;
        
        for (int i = 0; i < datos.getAhorcado().size(); i++) {
            if (datos.getAhorcado().get(i).equalsIgnoreCase(letra)) {
                aux = 1;
            }
        }

        if (aux >= 1) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Esta letra no exitste en la palabra.");
        }
    }
    
    public String [] encontradas (String []mostrarLetra, String letra, Ahorcado datos){
        
        for (int i = 0; i < datos.getAhorcado().size(); i++) {
            //para rellenar los vacios con asteriscos
            if (mostrarLetra[i]==null) {
              mostrarLetra[i]="*";  
            }
             //informa que ya ha sido utilizada.
            if (mostrarLetra[i].equalsIgnoreCase(letra)) {
                System.out.println("Esta letra ya ha sido ingresada.");
                break;
            }
            //completa el arreglo ahorcado y devuelve un arreglo con las letras encontradas.
            if (datos.getAhorcado().get(i).equalsIgnoreCase(letra)) {
                mostrarLetra[i]=datos.getAhorcado().get(i);   
            }     
        }
                  
       //System.out.println(mostrarLetra.length); muestra un int del tamaño del arreglo
       //System.out.println(Arrays.toString(mostrarLetra)); muestra el arreglo
        return mostrarLetra;
    }
    
    public ArrayList<String> letrasUsadas (String letra, ArrayList<String> letrasUsadas){
        
        letrasUsadas.add(letra);
        return letrasUsadas;
            
    }
   
    public int intentos(Ahorcado datos){
        return datos.getJugadas();  
    }
    public void gano (String[] mostrarJuego,Ahorcado datos,int life){
        int aux=0;
        for (int i = 0; i < datos.getAhorcado().size() ; i++) {
            if (mostrarJuego[i].equalsIgnoreCase(datos.getAhorcado().get(i))) {
                aux++;
            }
        }
        if (aux==datos.getAhorcado().size()) {
            System.out.println("Ganó");
        }else if (life==0 && aux<datos.getAhorcado().size()) {
            System.out.println("Perdió jajaja muere!!! la palabra era "+datos.getAhorcado());
            
        }
    }
}
