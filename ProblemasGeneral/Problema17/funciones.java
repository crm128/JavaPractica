package ProblemasGeneral.Problema17;

public class funciones {
    public static int[] rellenar(int n){
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100000);
        }

        return vector;
    }

    public static void imprimir(int[] v){
        for (int i : v) {
            System.out.println(i);
        }
    }

    public static int[] clasificar(int[] vector){
        int[] contador = new int[5];

        for (int i : vector) {
            switch (countDig(i)) {
                case 1:
                    contador[0] += 1;
                    break;
                case 2:
                    contador[1] += 1;
                    break;
                case 3:
                    contador[2] += 1;
                    break;
                case 4:
                    contador[3] += 1;
                    break;
                case 5:
                    contador[4] += 1;
                    break;                      
                default:
                    break;
            }
        }
        return contador;
        
    }
    public static int countDig(int n){  
        int count = 0;  
        while(n != 0){  
        n = n / 10;  
        count = count + 1;  
        }  
        return count;  
    }  
}
