package Exercicios;
import java.util.Scanner;
public class CalculoNotaComPeso {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = input.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        double p1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = input.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        double p2 = input.nextDouble();
        System.out.println("Digite a terceira  nota: ");
        double n3 = input.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        double p3 = input.nextDouble();
  
        double mp = n1 * p1 + n2 * p2+ n3 * p3; 
        double fm = mp / 6;
        System.out.println("O Resultado é: "+fm);
    }
}
