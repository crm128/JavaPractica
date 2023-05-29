package Problema14;

import java.util.Scanner;


/*Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y la 
moneda a converir que será una cadena, este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */
public class index {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros a convertir");
        double cantidad = leer.nextDouble();
        
        System.out.println("Escriba a que cambio realizar");
        System.out.println("libras, dolares o  yenes");
        String cambio = leer.next();

        funcionCambio(cantidad, cambio);

        leer.close();
    }

    public static void funcionCambio(double cantidad, String cambio){
        double conversion = 0;

        switch (cambio) {
            case "libras":
                conversion = cantidad/0.86;
                System.out.println("Equivalen a " + conversion+" libras");
                break;
            case "dolares":
                conversion = cantidad/1.28611;
                System.out.println("Equivalen a " + conversion+" U$D");
                break;
            case "yenes":
                conversion = cantidad/129.852;
                System.out.println("Equivalen a " + conversion+" yenes");
                break;
            default:
                System.out.println("Error, cambio no disponible");
                System.out.println("Intente nuevamente");
                break;
        }
    }
}
