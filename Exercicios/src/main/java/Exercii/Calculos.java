package Exercii;
import java.util.Scanner;
public class Calculos {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        double num1,num2;
        
            System.out.println("Informe um número: ");
            num1 = input.nextInt();
            
            System.out.println("Informe um segundo número: ");
            num2 = input.nextInt();
            
            System.out.println("Insira os numeros para a opção desejada:"
                    + "\n (1) - Para elevar os numeros (1^2); \n (2) - Para Informar a raiz quadrada dos numeros;"
                    + "\n (3) - Para informar Raiz Cubica dos numeros.");
            //escolha (numero) {
            numero = input.nextInt();
            switch(numero) {
                //caso numero escolhido = 1: escreva "Um"; parar...
                  case 1: 
                     int elev = (int) Math.pow(num1,num2);
            System.out.println(num1+" Elevado a "+num2+" é igual a: "+elev);
                          ; break;
                //caso numero escolhido = 2: escreva "Dois"; parar...
                  case 2:
                      int raiz1 = (int) Math.sqrt(num1);
                      int raiz2 = (int) Math.sqrt(num2);
                      System.out.println(" A Raiz de "+num1+" é ="+raiz1
                      + "\n A Raiz de "+num2+" é ="+raiz2);
                          ; break;
                  case 3: 
                      double raizC1 = (double) Math.cbrt(num1);
                      double raizC2 = (double) Math.cbrt(num2);
                      System.out.println(" A Raiz cubica de "+num1+" é ="+raizC1
                      + "\n A Raiz cubica de "+num2+" é ="+raizC2);
                          ; break;
                  default: System.out.println("Opção Invalida");
            
    }
  }
}
