
package entidades;

import java.util.ArrayList;


public class Equipo {
    private ArrayList <Jugador> jugador;
    
    public Equipo (){
        this.jugador=new ArrayList<>();
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador.add(jugador);
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugador=" + jugador + '}';
    }
    
}
