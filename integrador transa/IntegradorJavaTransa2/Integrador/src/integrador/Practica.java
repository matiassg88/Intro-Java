package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practica {

     
    public Boolean numeroPalindromo(Integer num) {
        
        if (num==null) {
            return false;
        }
        
        long numAbs;
        String numA;
        ArrayList<String> alDerecho = new ArrayList<String>();
        ArrayList<String> alVerre = new ArrayList<String>();
        
        //para obtener el valor absoluto
        numAbs=Math.abs(num);
        //para convertirlo en string en una string
        numA=String.valueOf(numAbs);
        
        //copia los indices de la string en un arraylist
        for (int i = 0; i < numA.length(); i++) {
            alDerecho.add(numA.substring(i, i+1));
        }
        //guarda el arraylist invertida en otra
        for (int i = numA.length()-1; i > -1; i--) {
            alVerre.add(alDerecho.get(i));
        }
        
        return alDerecho.equals(alVerre);
    }

    
//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán 
//    de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
     
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {

        int aux = inicio;
        int aux2 = 0;
        
        if (cantidadLadrones == 1) {
            return 0;
        }
        
        if (cantidadCaramelos > cantidadLadrones) {
            do {
                cantidadCaramelos -= cantidadLadrones;
            } while (cantidadCaramelos > cantidadLadrones);
        }

        //int[] ladrones = new int[cantidadCaramelos];
        for (int i = 0; i < cantidadCaramelos - 1; i++) {
            //ladrones[i] = aux;
            aux++;
        }

        return Math.abs(aux - cantidadLadrones);
    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
    
    public List<String> mediasAmigas(List<String> pasajeros) {
        //Aca escribir la logica necesaria
        return null;
    }
}
