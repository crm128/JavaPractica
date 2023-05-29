package ProblemasGeneral.Problema17;
/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector = funciones.rellenar(n);

        funciones.imprimir(vector);

        int[] contador = funciones.clasificar(vector);

        System.out.println("Hay "+ contador[0]+" numeros de una sola cifra");
        System.out.println("Hay "+ contador[1]+" numeros de dos cifras");
        System.out.println("Hay "+ contador[2]+" numeros de tres cifras");
        System.out.println("Hay "+ contador[3]+" numeros de cuatro cifras");
        System.out.println("Hay "+ contador[4]+" numeros de cinco cifras");
      
        
        leer.close();
    }
}
