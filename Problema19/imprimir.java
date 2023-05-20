package Problema19;

public class imprimir {
    public static void matriz(int[][] matriz,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
