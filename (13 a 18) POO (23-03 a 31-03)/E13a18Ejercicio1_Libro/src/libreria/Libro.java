/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author Aldana Hereñu
 */
public class Libro {
    
    public String titulo;
    public String autor;
    public int paginas;
    public int ISBN;

    public Libro(String titulo, String autor, int paginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", ISBN=" + ISBN + '}';
    }

    public Libro() {
    }
      
}
