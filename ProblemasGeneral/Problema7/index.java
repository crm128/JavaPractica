package ProblemasGeneral.Problema7;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java. */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresá una palabra");
        String palabra = teclado.nextLine();
        if (palabra.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }



        teclado.close();
    }
}
