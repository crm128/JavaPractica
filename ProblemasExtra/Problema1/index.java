package ProblemasExtra.Problema1;

import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
1 día, 2 horas. */
public class index {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de segundos a convertir");
        int segundos = leer.nextInt();

        int horas = funcion.horas(segundos);

        if (horas > 24) {
            int dias = funcion.dias(horas);
            horas = funcion.HorasRestantes(dias,horas);
            System.out.println("Equivalen a "+ dias+" dias, "+ horas+" horas");
        } else {
            
        }


        leer.close();
    }
}
