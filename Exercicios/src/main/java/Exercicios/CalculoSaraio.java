package Exercicios;
import java.util.Scanner;
public class CalculoSaraio {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Informe o numnero de Horas Trabalhadas: ");
        double ht = input.nextDouble();
        System.out.println("Informe o valor do Salario Minimo:");
        double sl = input.nextDouble();
        //1/10 = 10/100
        double slhr = sl * 10/100;
        double slrb = ht * slhr;
        double cx2 = slrb * 3 /100;
        double slrr = slrb - cx2;
        System.out.println("O salario a ser recebido será de: "+slrr);
    }
    
}
