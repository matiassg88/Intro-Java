/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/**
 * 
 * @author Aldana Hereñu
 */
public class ServicioPais {

    private Scanner sc = new Scanner(System.in);

    public void crearLista() {
        Pais pais = new Pais();
        ingresarPais(pais);
        mostrarConjunto(pais);
        ordenarLista(pais);
        seekAndDestroy(pais);
    }

    public void ingresarPais(Pais pais) {
        char res;
        String nuevoPais;
        do {
            System.out.println("Ingrese un país: ");
            nuevoPais = sc.nextLine();
            System.out.println("¿otro? S/N");
            res = sc.nextLine().charAt(0);
            pais.setPais(nuevoPais);
        } while (res != 'n' && res == 's');
    }

    public void mostrarConjunto(Pais pais) {
        System.out.println("----Paises ingresados----");
        for (String conjunto : pais.getPais()) {
            System.out.println(conjunto);
        }
    }

    public void ordenarLista(Pais pais) {
        ArrayList<String> coleccionOrdenada = new ArrayList<String>(pais.getPais());
        Collections.sort(coleccionOrdenada);
        System.out.println("----Paises por orden alfabetico----");
        for (String string : coleccionOrdenada) {
            System.out.println(string);
        }
    }

    public void seekAndDestroy(Pais pais) {
        System.out.println("Ingrese un país que desee eliminar: ");
        String paisEliminar = sc.nextLine();
        Iterator<String> it = pais.getPais().iterator();
        boolean band = false;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(paisEliminar)) {
                it.remove();
                band = true;
            }
        }
       
        if (band == false) {
            System.out.println("Este País no estaba en el conjunto.");
        }        
         mostrarConjunto(pais);
    }
}