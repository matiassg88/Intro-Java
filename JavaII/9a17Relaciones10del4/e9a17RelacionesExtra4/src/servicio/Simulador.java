/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;

/**
 *
 *crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.


 

Nota: usar listas de tipo String para generar los nombres y los apellidos.
* 
* 


• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.

• Se debe imprimir por pantalla el listado de alumnos.
* • Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.

• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.

• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
 */
public class Simulador {
    
    /*
    • La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne.
Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria.*/
    public ArrayList <String> listadoAlumnos (){
        String [] nombre = new String []{"Nadia","Gianni","Tomas","Matías","Fabio","Lucia"};
        String [] apellido = new String []{" Gonzalez"," Yocco"," Manoukian"," Rojas"," De la Canal"," Souto"};
        ArrayList <String> listaAlumnos=new ArrayList<>();
        int cantAlumn =Math.round((int)(Math.random()*26)+15);
        for (int i = 0; i < cantAlumn; i++) {
        int nom = Math.round((int)(Math.random()*6)+1);
        int ape = Math.round((int)(Math.random()*6)+1); 
        
        listaAlumnos.add(nombre[nom]+apellido[ape]);
        }
        
        return listaAlumnos;
    }
    /*
    • Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.    
    */
    public ArrayList generarDni (int listaAlumnosSize){
        ArrayList <String> dniAlumnos=new ArrayList<>();
        int max = 99999999;
        int min = 10000000;
        int dni;
        
        for (int i = 0; i < listaAlumnosSize; i++) {
            dni = Math.round((int) (Math.random() * (max - min + 1)) + min);//nuevo DNI
            dniAlumnos.add(String.valueOf(dni));//Agrega nuevo DNI

            if (i > 0) {//si esta en la segunda iteracion

                for (int j = 0; j < dniAlumnos.size(); j++) {//hasta el tamaño actual del arreglo
                    /***
                     * si lo que contiene nuevo indice (i)==los anteriores(j) 
                     * remover i
                     * sumar 1 al total de ciclos del bucle principal para que el tamaño resultante de la lista ea el esperado
                     */
                    if (dniAlumnos.get(i).equalsIgnoreCase(dniAlumnos.get(j))) {
                        dniAlumnos.remove(i);
                        listaAlumnosSize+=1;
                        continue;
                    }
                }
            }

        }

        return dniAlumnos;
    }
}
