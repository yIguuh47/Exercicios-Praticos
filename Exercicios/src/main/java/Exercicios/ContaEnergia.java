package Exercicios;
import java.util.Scanner;
public class ContaEnergia {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Informe o Salario Minimo: ");
        double slr = input.nextDouble();
        System.out.println("Digite a Quantidade de Quilowatts Consumida: ");
        double wts = input.nextDouble();
        double pwts = slr * 20 /100;
        double vlrw = wts * pwts;
        double desc = vlrw * 15 / 100;
        double fn =vlrw - desc;
        System.out.println("1 Quilowatts Vale:"+pwts);
        System.out.println("O valor a ser pago é de: "+fn);
    }
}
