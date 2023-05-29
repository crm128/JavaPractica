package Problema13;

import java.util.Scanner;

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter "*"  */
public class index {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingre el tamaño del cuadrado");
        int N = teclado.nextInt();

        Dibujar(N);

        teclado.close();
    }


    public static void Dibujar(int N){
        String[][] matriz = new String[N][N];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = "*";
            }
        }

        for (int i = 1; i < matriz.length-1; i++) {
            for (int j = 1; j < matriz.length-1; j++) {
                matriz[i][j] = " ";
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
