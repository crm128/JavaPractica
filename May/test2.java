/*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25 */

package May;

import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingresar el primer numero");
        int n1= leer.nextInt();

        System.out.println("Ingresar el segundo numero");
        int n2= leer.nextInt();
        leer.close();

        if ((n1>25) & (n2 >25)) {
           
                System.out.println("Ambos numeros son mayores a 25");
            } else{ 
                if (n1>25) {
                    System.out.println("n1 es mayor a 25");
                } else{
                    if(n2>25){
                        System.out.println("N2 es mayor a 25");
                    }
                }
            }
        }


       
    }
