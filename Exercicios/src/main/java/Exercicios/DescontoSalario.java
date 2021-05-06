package Exercicios;
import java.util.Scanner;
public class DescontoSalario {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Informe o salario Bruto R$: ");
        double Brut = input.nextDouble();
        double j1 = Brut * 5 / 100;
        double grat = Brut + j1;
        
        double j2 = grat * 7 /100;
        double desc = grat - j2;
        System.out.println("O Salario a ser pago é de R$: "+desc);
    }
    
}
