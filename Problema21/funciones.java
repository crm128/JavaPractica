package Problema21;

public class funciones {
    public static int[][] subMatriz(int[][] matriz,int n,int m){
        int[][] P = new int[3][3];
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[i].length; j++) {
                P[i][j] = matriz[n+i][m+j];
            }
        }
        return P;
    }
    public static int[][] subMatrizAleatoria(){
        int[][] M = new int[3][3];
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
                M[i][j]=(int) (10+Math.random()*90);
            }
        }
        return M;
    }
    public static boolean contenida(int[][] M,int[][] X){
        for (int i = 0; i < M.length-3; i++) {
            for (int j = 0; j < M[i].length-3; j++) {
                X = subMatriz(M,i,j);
                //falta comprar cada submatriz X con la matriz P
                //pedirla por parametros a la matriz P

            }
        }


        return true;
    }
}
