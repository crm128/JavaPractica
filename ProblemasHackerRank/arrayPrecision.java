package ProblemasHackerRank;
//import java.text.DecimalFormat;
public class arrayPrecision {
    public static void main(String[] args) {
       // int[] arr = new int[5];
      /*  arr[0]=1;      
        arr[1]=-1;
        arr[2]=0;
        arr[3]=1;
        arr[4]=-1; */
        //En el problema arr era una lista de int
        //por eso lo cambio a arreglo
        
        int[] arreglo = new int[arr.size()];
 
        for (int i = 0; i < arr.size(); i++){
            arreglo[i] = arr.get(i);}

        int p = 0;
        int n = 0;
        int c = 0;
        double pRatio = 0;

        double nRatio = 0;
        double cRatio = 0;
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>0){
                p=p+1;
            }else if(arreglo[i]==0){
                c=c+1;
            }else{
                n=n+1;
                }
            }
        pRatio =(double) p/arreglo.length;
        nRatio =(double) n/arreglo.length;
        cRatio =(double) c/arreglo.length;

        System.out.printf("%,.6f",pRatio);
        System.out.println("");
        System.out.printf("%,.6f",nRatio);
        System.out.println("");
        System.out.printf("%,.6f",cRatio);
        System.out.println("");
    }
}
