package Problema22;

public class index {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n+1; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            } 
        }


    }
    
}   