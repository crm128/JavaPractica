public class Operaciones {
    public static int suma(int a,int b){
        return a+b;
    }
    public static int resta(int a,int b){
        return a-b;
    }
    public static int multiplicacion(int a,int b){
        return a*b;
    }
    public static double division(int a,int b){
        double c = a;
        double d = b;
        if (b != 0) {
            return (c/d);
        }else{
            return 0;
        }
        
    }
}
