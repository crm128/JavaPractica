package ProblemasGeneral.Problema12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O. Las secuencias 
leídas que respeten el formato se consideran correctas, la secuencia especial 
“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. Al finalizar el proceso, 
se imprime un informe indicando la cantidad de lecturas correctas e incorrectas 
recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals(). */
public class index {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String input;
        
        String salida = "&&&&&";

        List<Boolean> lista = new ArrayList<>();
        
        do {
            input = teclado.nextLine();
            lista.add(funciones.verificar(input));

        } while (!input.equals(salida));

        System.out.println("Resultado: ");

        funciones.imprimir(lista);


        teclado.close();        
    }
}