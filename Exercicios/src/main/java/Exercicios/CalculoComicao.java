package Exercicios;
import java.util.Scanner;
public class CalculoComicao {
    public static void main (String[]args){
    Scanner input = new Scanner (System.in);
        System.out.println("Informe o valor das vendas R$: ");
        double vend = input.nextDouble();
        System.out.println("Informe o salario Bruto R$: ");
        double sal = input.nextDouble();
        double acre = vend * 4 / 100;
        double tot = sal + acre;
        System.out.println("O Salario a ser pago é de R$: "+tot);
    }
}
