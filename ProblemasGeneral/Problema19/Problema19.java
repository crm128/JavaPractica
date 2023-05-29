package ProblemasGeneral.Problema19;

public class Problema19 {
/*Realice un programa que compruebe si una matriz dada es anti simétrica. 
Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia
traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus 
filas por columnas (o viceversa). */

    public static void main(String[] args) {
        int n = 4;
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] matriz3 = new int[n][n];

        rellenar.matriz(matriz1,n);
        rellenar.matriz(matriz2,n);
        imprimir.matriz(matriz1,n);
        imprimir.matriz(matriz2,n);
        matriz3 = funciones.antitranspuesta(matriz1);
        imprimir.matriz(matriz3,n);
        System.out.println("Comparo matriz 1 con 2");
        System.out.println("Son antitranspuesta?:"+funciones.testeoAntitraspuesta(matriz1, matriz2));
        System.out.println("");
        System.out.println("Comparo matriz 1 con 3");
        System.out.println("Son antitranspuesta?:"+funciones.testeoAntitraspuesta(matriz1, matriz3));
    }
    
}
