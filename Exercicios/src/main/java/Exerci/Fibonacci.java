package Exerci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
   
    int a=0,b=0,aux,i = 0;

    System.out.println("Digite (1) para iniciar a série de Fibonacci: ");
                a = input.nextInt();
                
        do {
            System.out.println("Série de Fibonacci: "+a);
            aux = a;
            a = a+b;
            b= aux;
                i++;
        } while( i <=10 );
    }
}
