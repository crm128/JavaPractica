package ProblemasGeneral.Problema10;

import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial. */
public class index {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int límite = teclado.nextInt();
        int suma = 0;
        while (suma < límite) {
            System.out.println("Ingrese un numero");
            suma += teclado.nextInt();
            System.out.println("Suma actual: "+suma);
        }

        System.out.println("Limite alcanzado");




        teclado.close();
    }
}
