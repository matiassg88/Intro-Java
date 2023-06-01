/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class EdificioDeOficina extends Edificio {
    private int cantidadOficinas;
    private int personasPorOficinas;
    private int cantidadDePisos;

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(int cantidadOficinas, int personasPorOficinas, int cantidadDePisos, double anchoProf, double alto, double largo) {
        super(anchoProf, alto, largo);
        this.cantidadOficinas = cantidadOficinas;
        this.personasPorOficinas = personasPorOficinas;
        this.cantidadDePisos = cantidadDePisos;
    }

    public int getCantidadOficinas() {
        return cantidadOficinas;
    }

    public int getPersonasPorOficinas() {
        return personasPorOficinas;
    }

    public int getCantidadDePisos() {
        return cantidadDePisos;
    }

    
    public void cantPersonas(){
        System.out.println("La cantidad de personas por oficina es: "+ personasPorOficinas);
        System.out.println("La cantidad total de personas en el edificio es: "+(personasPorOficinas*cantidadDePisos));
    }
    
    @Override
    public void calcularSuperficie() {
     double superficie=largo*anchoProf;  
     System.out.println("Superficie: "+superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen=largo*anchoProf*alto;
        System.out.println("Volumen: "+volumen);
    }
    
}
