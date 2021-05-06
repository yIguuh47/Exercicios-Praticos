package Exercicios;
import java.util.Scanner;     
public class Divisao {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numb1 = input.nextDouble();
        System.out.println("Digite um segundo numero: ");
        double numb2 = input.nextDouble();
        double result;
                result = numb1/numb2;
        System.out.println("O resultado de "+numb1+" / "+numb2+" é = "+result+".");
    }
}
