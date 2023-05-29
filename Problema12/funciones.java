package Problema12;

import java.util.List;

public class funciones {
    public static boolean verificar(String input){
        if (input.length() == 5 ) {
            if (input.charAt(0) == 'X' && input.charAt(4) == 'O') {
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }        
    }

    public static void imprimir(List<Boolean> lista){
        for (Boolean boolean1 : lista) {
            System.out.println(boolean1);
        }
    }
}
