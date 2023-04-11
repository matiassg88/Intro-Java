/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoPaquete;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Puntos {
    
    public double x1, x2, y1, y2;
    
    public Puntos (){
        
    }
    public void crearPuntos(){
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Punto 1:\nx)");
        x1=sc.nextDouble();
        System.out.print("y)");
        y1=sc.nextDouble();
        System.out.print("Punto 2:\nx)");
        x2=sc.nextDouble();
        System.out.print("y)");
        y2=sc.nextDouble();
    }
public double calcuDist(){
     /*
    d(P1,P2)=√(x2−x1)^2+(y2−y1)^2
    */
     return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    
}
    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }
   
}
