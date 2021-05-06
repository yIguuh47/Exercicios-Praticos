package Exerci;
import java.util.Scanner;
public class QuadradoAte200 {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
         int i;
         //para i=15 faça i++ até i ser igual a 200..
         for (i = 15; i<=200; i++){ 
         System.out.println("O quadrado de "+i+" é:"+i*i);}
     }
}
