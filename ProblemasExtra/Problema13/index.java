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
        
        int contador=1;
        String texto="";
        while (contador<numero+1) {
            texto = texto.concat(String.valueOf(contador));
            System.out.println(texto);
            contador++;
        }
        
        leer.close();

    }
}
