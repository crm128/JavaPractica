package ProblemasGeneral.Problema6;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
/*Crear un programa que dado un numero determine si es par o impar */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = teclado.nextInt();
        if (n%2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }


        teclado.close();
    }
}
