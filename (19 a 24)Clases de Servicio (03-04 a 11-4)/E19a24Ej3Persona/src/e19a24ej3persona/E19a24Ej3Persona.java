/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e19a24ej3persona;

import persona_Entidades.Persona;
import servicios.PersonaServicio;


public class E19a24Ej3Persona {

        public static void main(String[] args) {
            int aux=0;
            int aux2=0;
        PersonaServicio p = new PersonaServicio();
        //crea objeto de tipo persona para pasar por parametro
        Persona pe = new Persona();
        //crea vector para generar una cantidad determinada de personas
        Persona pp[] = new Persona[4];
        for (int i = 0; i < 4; i++) {
            //se guarda cada persona nueva en un indice del vector
           System.out.println("Persona: "+i);
            pp[i] = p.crearPersona(pe);
            String toString = pp[i].toString();
            System.out.println(toString);
            
            if (p.esMayor(pp[i])==true) {
                System.out.println("es mayor");
                aux++;
            }else System.out.println("es menor");
           if (p.calcularIMC(pp[i])==0) {
                
                aux2++;
            }else if (p.calcularIMC(pp[i])==0){ 
                
            }
            p.calcularIMC(pp[i]);
            
            
        }
           p.porcentajes(pp);
    }
}
