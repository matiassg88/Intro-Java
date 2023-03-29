package e13a18ej3operacion;

import java.util.Scanner;
import operaciones.Operacion;

public class E13a18Ej3Operacion {

    public static void main(String[] args) {
        int num1=0, num2 = 0;
        String res;
        Operacion conPara = new Operacion(num1, num2);//constructor con atributos ¿pa qué?
        Operacion conVacio = new Operacion();//constructor sin atributos
        Scanner sc = new Scanner(System.in);
        do {
            crearOperacion(sc, conVacio);
            System.out.println("\rIngrese una accion que desee realizar:\n(1)Sumar.\n(2)Restar.\n(3)Multiplicar.\n(4)Dividir.");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    sumar(conVacio);
                    break;
                case 2:
                    restar(conVacio);
                    break;
                case 3:
                    multiplicar(conVacio);
                    break;
                case 4:
                    dividir(conVacio);
                    break;
            }
            System.out.println("¿Desea crear otra operacion? s/n: ");
            res = sc.next();
            res = res.toLowerCase();
        } while (res.equals("s"));


    }

    public static void crearOperacion(Scanner sc,Operacion conVacio) {
        System.out.println("Ingrese dos números para realizar operaciones: ");
        conVacio.setNum(sc.nextInt(), sc.nextInt());
        System.out.println(conVacio.toString());
        } //que le pide al usuario los dos números y los guarda en los atributos del objeto.

    private static void sumar(Operacion conVacio) {
        System.out.println("La suma da: "+conVacio.sumar());
    }

    private static void restar(Operacion conVacio) {
        System.out.println("La resta da: "+conVacio.restar());
    }

    private static void multiplicar(Operacion conVacio) {
        if (conVacio.getNum1()==0 || conVacio.getNum2()==0) {
            System.out.println("Todo número multiplicado por cero es igual a cero.");
            
        }else System.out.println("La multiplicacion da: "+conVacio.multiplicar());
        
    }

    private static void dividir(Operacion conVacio) {
         if (conVacio.getNum1()==0 || conVacio.getNum2()==0) {
            System.out.println("Todo número dividido en cero es igual a cero.");
            
        }else System.out.println("La división da: "+conVacio.dividir());
    }   
}
