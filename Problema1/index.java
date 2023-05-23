package Problema1;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        /*Escribir un programa que pida dos números enteros por teclado y 
        calcule la suma de los dos. El programa deberá después mostrar el 
        resultado de la suma */
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Ingrese un primer numero");
        int n1 = teclado.nextInt();
 
        System.out.println("Ingrese un segundo numero");
        int n2 = teclado.nextInt();
 
        int suma = Operaciones.suma(n1, n2);
 
        System.out.println("la suma es:" + suma);
         
        teclado.close();
    }
}
