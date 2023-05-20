package Problema19;

public class rellenar {
    public static void matriz(int[][] matriz,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j]=(int) (10+Math.random()*90);
            }
        }
    }
}
