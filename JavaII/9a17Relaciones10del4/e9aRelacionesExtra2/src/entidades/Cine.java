/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Cine {
    private Peliculas pelicula;
    private int precioEntrada;
    private Asiento [][] salaUnica;
    private Asiento asiento = new Asiento ();
    
    
    public Cine() {
        
        String [] columnas={"A","B","C","D","E","F"};
        salaUnica = new Asiento [8][6]; 
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                this.salaUnica[i][j]=new Asiento (columnas[j], i+1, false);                                        
            }
        }
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Asiento[][] getSalaUnica() {
        return salaUnica;
    }

    public void setSalaUnica(Asiento[][] salaUnica) {
        this.salaUnica = salaUnica;
    }
    public void mostrarSala (){
        
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                
                System.out.print(salaUnica[i][j].toString()+" ");   
                
            }
            System.out.println("");
        }
    }
}
