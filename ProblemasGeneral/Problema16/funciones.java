package ProblemasGeneral.Problema16;

import java.util.ArrayList;
import java.util.List;

public class funciones {
    public static int[] rellenar(int n){
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100);
        }

        return vector;
    }

    public static void imprimir(int[] v){
        for (int i : v) {
            System.out.println(i);
        }
    }

    public static void buscar(int[] vector,int buscado){
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscado) {
                lista.add(i);
            }
        }
       

        switch (lista.size()) {
            case 0:
                System.out.println("El numero no se encuentra en el vector");
                break;
            case 1:
                System.out.println("El numero se encuentra una vez en el vector");
                System.out.println("En la siguiente posicion");
                System.out.println(lista);
                break;
            default:
                System.out.println("El numero se encuentra "+lista.size()+" veces en el vector");
                System.out.println("En las siguientes posiciones");
                System.out.println(lista);
                break;
        }
    }
}
