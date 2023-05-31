package ProblemasExtra.Problema13;

import java.util.Scanner;

/*Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera 
al usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1 
12 
123 */
public class index {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        
        int contador;

        while (conta) {
            
        }
        int[] vector = new int[5];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100);
        }

        int suma=0;
        for (int i : vector) {
            System.out.print(i+" ");
            suma = suma + i;
        }

        System.out.println("");
        System.out.println(suma);

        int suma2=0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
            suma2 = suma2 + vector[i];
        }

        System.out.println("");
        System.out.println(suma2);
    }
}
