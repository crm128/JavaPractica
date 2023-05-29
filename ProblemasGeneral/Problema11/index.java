package ProblemasGeneral.Problema11;
import java.util.Scanner;

public class index {
/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú. */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int a = leer.nextInt();
        System.out.println("Ingrese un segundo numero");
        int b = leer.nextInt();
        boolean salir = true;

        while (salir) {
            //System.out.print("\033[H\033[2J");  
            //System.out.flush(); 
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Ingrese ");
            int c = leer.nextInt();
            switch (c) {
                case 1:
                    System.out.println("El resultado es: " + Operaciones.suma(a, b));
                    leer.nextLine();
                    break;
                case 2:
                    System.out.println("El resultado es: " + Operaciones.resta(a, b));
                    break;
                case 3:
                    System.out.println("El resultado es: " + Operaciones.multiplicacion(a, b));
                    break;
                case 4:
                    System.out.println("El resultado es: " + Operaciones.division(a, b));
                    break;
                case 5:
                    System.out.println("Confirme que quiere salir S/N");
                    leer.next();
                    char confirmar = leer.next().charAt(0);
                    if ( confirmar == 'S'){
                        salir = false;
                    }
                    break;
                default:
                    salir = false;
            }
            System.out.println("");
        }
        leer.close();
    }
}