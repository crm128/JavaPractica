package ProblemasExtra.Problema2;

/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente 
a cada una. A continuación, realizar las instrucciones necesarias para que: B tome 
el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo 
una variable auxiliar.*/
public class index {
    public static void main(String[] args) {
        int A = funcion.aleatorio();
        int B = funcion.aleatorio();
        int C = funcion.aleatorio();
        int D = funcion.aleatorio();

        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        System.out.println("");
        
        int aux;
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);

    }
}