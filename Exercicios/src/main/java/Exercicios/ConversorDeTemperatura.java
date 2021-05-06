package Exercicios;
import java.util.Scanner;
public class ConversorDeTemperatura {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Insira sua Temperatura em Celsius: ");
        double tmpc = input.nextDouble();
        double tmpf = 9 * tmpc / 5 + 32;
        System.out.println("Sua Temperatura em Fahrenheit é: "+tmpf);
    }
}
