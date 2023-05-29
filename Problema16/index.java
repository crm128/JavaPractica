package Problema16;

import java.util.Scanner;


/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios 
y le pida al usuario un numero a buscar en el vector. El programa mostrará donde 
se encuentra el numero y si se encuentra repetido */
public class index {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector = funciones.rellenar(n);

        funciones.imprimir(vector);

        System.out.println("Ingrese el numero a buscar");
        int buscado = leer.nextInt();

        funciones.buscar(vector, buscado);
        
        leer.close();
    }
}
