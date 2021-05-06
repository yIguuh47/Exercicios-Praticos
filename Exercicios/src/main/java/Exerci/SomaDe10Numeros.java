package Exerci;
import java.util.Scanner;
public class SomaDe10Numeros {
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
          
          int number,fin = 0,n = 0;
          
          while (n < 10) {
              System.out.println("Digite um Numero:");
          number = input.nextInt();
          n++;
          fin = number +fin;
          }
          System.out.println("A soma de Todos Numeros é de: "+fin);
    }
}
