package ProblemasExtra.Problema23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” de 
tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en 
una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
 Finalmente imprima por pantalla la sopa de letras creada. Nota: Para resolver el 
 ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java 
 substring(), Length() y Math.random(). */
public class index {
    public static void main(String[] args) {
        List<String> palabra = new ArrayList<>();
        palabra.add("hola");
        palabra.add("mundo");
        palabra.add("cruel");
        palabra.add("par");
        palabra.add("exit");

        Collections.shuffle(palabra);

        /* 
        System.out.println("Haciendo uso de ForEach");
        palabra.forEach(name->{ 
            System.out.println(name);
        });
        */

        HashSet<Integer> aleatorioVertical = new HashSet<Integer>();
        HashSet<Integer> aleatorioHorizontal = new HashSet<Integer>();
        do {
            aleatorioHorizontal.add((int) (Math.random()*15));
            aleatorioVertical.add((int) (Math.random()*21));
        } while (aleatorioHorizontal.size()<5 && aleatorioVertical.size()<5);

        

        String[][] matriz = new String[20][20];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = String.valueOf((int) (Math.random()*9));
            }
        }
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            }
            System.out.println("");
        }
    
    }
}
