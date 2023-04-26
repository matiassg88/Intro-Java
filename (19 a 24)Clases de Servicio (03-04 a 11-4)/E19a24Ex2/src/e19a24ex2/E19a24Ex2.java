/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e19a24ex2;

import servicios.NIFservices;

/**
 *
 * @author Aldana Hereñu
 */
public class E19a24Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char [] letras =new char [23];
       NIFservices nif=new NIFservices();
       
letras[0] = 'T';
letras[1] = 'R';
letras[2] = 'W';
letras[3] = 'A';
letras[4] = 'G';
letras[5] = 'M';
letras[6] = 'Y';
letras[7] = 'F';
letras[8] = 'P';
letras[9] = 'D';
letras[10] = 'X';
letras[11] = 'B';
letras[12] = 'N';
letras[13] = 'J';
letras[14] = 'Z';
letras[15] = 'S';
letras[16] = 'Q';
letras[17] = 'V';
letras[18] = 'H';
letras[19] = 'L';
letras[20] = 'C';
letras[21] = 'K';
letras[22] = 'E';
nif.crearNif();
nif.calcular(letras);
nif.mostrar();
    }
    
}
