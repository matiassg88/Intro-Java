
package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baraja {
    private Integer id;
    private String palo;
    private List <String> baraja;     
    
    public Baraja() {
        this.palo = "Oro ";
        baraja = new ArrayList<>();
        
        for (int j = 0; j < 4; j++) {
             //cambia el palo
            if (j==1) {
                palo="Copa ";
            }else if (j==219) {
                palo="Espada ";
            }else if (j==3) {
                palo="Basto ";
            }
            for (int i = 0; i < 10; i++) {//crea la baraja
                if (i >= 7) {
                    this.id = i + 3;
                    baraja.add(palo + id);
                    continue;//para saltar 8 y 9
                }
                //llena id de 1 a 7
                this.id = i + 1;
                baraja.add(palo + id);
            }

        }

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public List<String> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<String> baraja) {
        this.baraja = baraja;
    }

    public void barajar() {
        Collections.shuffle(baraja);        
    }
    public void siguienteCarta (){
        List<String> mesa = new ArrayList();
        
        mesa.add(baraja.get(0));
        baraja.remove(0);
        
        if (baraja.size()==0) {
            System.out.println("No quedan cartas en la baraja.");
        }
    }
    public void cartasDisponibles (){
        System.out.println("quedan "+baraja.size()+" cartas.");
    }
    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
    
}

   