package Problema21;

public class definir {
    public static int[][] grande(){
        int[][] M = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                M[i][j]=(int) (10+Math.random()*90);
            }
        }
        return M;
    }
    
}
