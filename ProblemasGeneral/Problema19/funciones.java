package ProblemasGeneral.Problema19;

public class funciones {
    public static int[][] antitranspuesta(int[][] matriz){
        int[][] matriz2 = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz2[j][i] = -1*matriz[i][j];
            }
        }
        return matriz2;
    }
    public static boolean testeoAntitraspuesta(int[][] matriz1,int[][] matriz2){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(matriz1[i][j]!=-matriz2[j][i]){
                    return false;
                }

            }
        }
        return true;
    }
}
