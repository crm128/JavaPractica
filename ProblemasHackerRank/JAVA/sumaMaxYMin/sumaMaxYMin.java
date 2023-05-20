package ProblemasHackerRank.JAVA.sumaMaxYMin;
public class sumaMaxYMin {
    public static void main(String[] args) {
        //List<String> arr = new LinkedList<String>();
        /*List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        */
        //---------------------------------
        //Codigo para trabajar con listas como arreglos
        /*
        int[] arreglo = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++){
            arreglo[i] = arr.get(i);}
        https://www.welivesecurity.com/2022/02/21/integer-overflow-how-it-occur-can-be-prevented/
         */
        int[] arreglo = new int[5];
        arreglo[0]=1;
        arreglo[1]=3;
        arreglo[2]=5;
        arreglo[3]=7;
        arreglo[4]=9;
        long min = arreglo[0];
        long max = arreglo[0];
        long suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
            if (min>arreglo[i]) {
                min = arreglo[i];
            }
            if (max<arreglo[i]) {
                max = arreglo[i];
            }
        }
        System.out.print(suma-max);
        System.out.print(" ");
        System.out.print(suma-min);
   
    }
}
