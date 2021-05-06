package Exercicioos;
import java.util.Scanner;
public class MenorNum {
public static void main (String[] agrs) {
     Scanner input = new Scanner (System.in);
    
      System.out.println("Informe um Valor: ");
      int n1 = input.nextInt();
      
      System.out.println("Informe um Valor: ");
      int n2 = input.nextInt();
      
      System.out.println("Informe um Valor: ");
      int n3 = input.nextInt();
      
      int maior;
      
      if (n1 < n2) {
        System.out.println("O Menor valor é: "+n1); 
    } else if (n2 < n3){
        System.out.println("O Menor valor é: "+n2);
    } else {
        System.out.println("O Menor valor é: "+n3);}
      
  }
}