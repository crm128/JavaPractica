package ProblemasGeneral.Problema3;
import java.util.Scanner;
public class index {
    public static void main(String[] args) {
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java. */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = entrada.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());

        entrada.close();
    }
}
