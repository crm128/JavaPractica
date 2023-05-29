package ProblemasGeneral.Problema18;
/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa). */
public class Problema18{   
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4]; 
        System.out.println("Matriz original");
        rellenarMatriz(matriz); 
        System.out.println("Test2");
        mostrarMatriz(matriz);
        matrizT =invertirMatriz(matriz); 
        System.out.println("");
        System.out.println("Matriz transpuesta");
        mostrarMatriz(matrizT);    
    }
    public static void rellenarMatriz(int[][] matriz){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]=(int) (10+Math.random()*90);
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static int[][] invertirMatriz(int[][] matriz){
        int[][] matriz2 = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz2[j][i] = matriz[i][j];
            }
        }
        return matriz2;
    }
}
