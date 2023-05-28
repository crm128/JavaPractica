package Problema9;

import java.util.Scanner;

/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java. */
public class index {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.nextLine();
        if (palabra.toLowerCase().substring(0, 1).equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }


        teclado.close();
    }
}
