package Exerci;
import java.util.Scanner;
public class SomaOuElevacao {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
           int numero;

            System.out.println("Menu de Opções: ");
            System.out.println("Digite (1) Para somar dois números.");
            System.out.println("Digite (2) Para elevar número ao quadrado.");
            numero = input.nextInt();
            //escolha (numero) {
            switch(numero) {
                  case 1: System.out.println("1.	Somar dois números. ");
                  
                     System.out.println("Digite o primeiro numero:");
                        int num1 = input.nextInt();
                        
                     System.out.println("Digite o segundo numero:");
                        int num2 = input.nextInt();
                        
                     int med = num1 + num2;
                      System.out.println("O resultado é: "+med);
                      
                          break;
                  case 2: System.out.println("2.	Número ao quadrado. ");
                  
                     System.out.println("Digite o numero: ");
                        int num4 = input.nextInt();
                        
                        int quadra = num4 * num4;
                        System.out.println("O numero elevado ao quadrado é: "+quadra);
                        
                           break;
                //senão : escreva "numero invalido";}
                  default: System.out.println("Número inválido!");}
    }
}

