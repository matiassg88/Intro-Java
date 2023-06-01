/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aldana Hereñu
 */
public class Pais {
    private Set <String> pais;

    public Pais() {
        pais=new HashSet <>();
    }

    public Pais(Set<String> pais) {
        this.pais = pais;
    }

    public Set<String> getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais.add(pais);
    }    
}
