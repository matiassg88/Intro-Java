/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Peliculas {
    private String titulo;
    private String autor;
    private int [] horas=new int [2];

    public Peliculas() {
    }

    public Peliculas(String titulo, String autor, int [] horas) {
        this.titulo = titulo;
        this.autor = autor;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int [] getHoras() {
        return horas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setHoras(int [] horas) {
        this.horas = horas;
    }
    
}
