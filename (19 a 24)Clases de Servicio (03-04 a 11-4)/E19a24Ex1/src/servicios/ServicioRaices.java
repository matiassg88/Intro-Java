/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Raices;

/**
 *
 * @author Aldana Hereñu
 */
public class ServicioRaices {

    Raices coe = new Raices(2,5,-10);

    /*
Método getDiscriminante(): devuelve el valor del discriminante (double). 
    El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
     */
    public double getDiscriminante() {
        return (double) Math.pow(coe.getB(), 2) - (4 * coe.getA() * coe.getC());
    }

    /*
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
    para que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    /*
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
    para que esto ocurra, el discriminante debe ser igual que 0.*/
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    /*
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    (-b±√((b^2)-(4*a*c)))/(2*a) */
    public void obtenerRaices() {
        if (tieneRaices() == true) {
            System.out.println("x\u2081: " + ((-coe.getB() + Math.sqrt((Math.pow(coe.getB(), 2) - (4 * coe.getA() * coe.getC())))) / 2 * coe.getA())
                    + "\nX\u2082: " + ((-coe.getB() - Math.sqrt((Math.pow(coe.getB(), 2) - (4 * coe.getA() * coe.getC())))) / 2 * coe.getA()));
        } else {
            System.out.println("obtenerRaices metodo: no es posible obtener resultado");
        }
    }

    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
    Es en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz() {
        if (tieneRaiz() == true) {
            System.out.println("x1: " + ((-coe.getB() + Math.sqrt((Math.pow(coe.getB(), 2) - (4 * coe.getA() * coe.getC())))) / 2 * coe.getA())
                    + "\nX2: " + ((-coe.getB() - Math.sqrt((Math.pow(coe.getB(), 2) - (4 * coe.getA() * coe.getC())))) / 2 * coe.getA()));
        } else {
            System.out.println("obtenerRaiz metodo: no es posible obtener resultado");
        }
    }

    /*

Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), 
    y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos 
    y en caso de no existir solución, se mostrará un mensaje. 
     */
    public void calcular() {

        obtenerRaiz();
        obtenerRaices();
        String toString = coe.toString();
        System.out.println(toString);
    }

    /*
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
     */
}
