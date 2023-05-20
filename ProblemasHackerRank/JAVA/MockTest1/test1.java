package ProblemasHackerRank.JAVA.MockTest1;

import java.util.Arrays;

public class test1 {
    

    public static void main(String[] args) {
        int n = 7;
        int[] arreglo = new int[n];
        Arrays.sort(arreglo);
        //---------------------------
        // formula para calcular el centro del arreglo
        int posicion = n/2*(1-1%1);
        //---------------------------
        System.out.println(arreglo[posicion]);
        //return arreglo[posicion];
    }



}
