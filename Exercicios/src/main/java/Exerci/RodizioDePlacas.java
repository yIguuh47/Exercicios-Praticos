package Exerci;
import java.util.Scanner;
public class RodizioDePlacas {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
         int num,ult;
         
         System.out.println("Informe os ultimo número de sua placa: ");
            num = input.nextInt();
            ult = num %10;
            //escolha (numero) {
            switch(ult) {
                //caso numero escolhido = 0: escreva "Zero"; parar...
                  case 0: System.out.println("Janeiro do proximo ano"); break;
                //caso numero escolhido = 1: escreva "Um"; parar...
                  case 1: System.out.println("Fevereiro do proximo ano"); break;
                //caso numero escolhido = 2: escreva "Dois"; parar...
                  case 2: System.out.println("Marco do proximo ano"); break;
                  case 3: System.out.println("Abril do proximo"); break;
                  case 4: System.out.println("Maio do proximo ano"); break;
                  case 5: System.out.println("Junho do proximo ano"); break;
                  case 6: System.out.println("Setembro do proximo ano"); break;
                  case 7: System.out.println("Outubro do proximo ano"); break;
                  case 8: System.out.println("Novembro do proximo ano"); break;
                  case 9: System.out.println("Dezembro do proximo ano"); break;
                //senão : escreva "numero invalido";}
                  default: System.out.println("Número inválido!");}
    }
}
