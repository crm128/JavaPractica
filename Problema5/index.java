package Problema5;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt(). */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int n = leer.nextInt();
        int doble = n * 2;
        int triple = n * 3;
        double raiz = Math.sqrt(n);

        System.out.println("El doble es " + doble);
        System.out.println("El triple es " + triple);
        System.out.println("La raiz es " + raiz);

        leer.close();
    }
}
