package Exercicios;
import java.util.Scanner;
public class Desconto {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("=================Promoção=Do=Dia==================");
        System.out.println("=======Qualquer=Produto=Com=10%=de=Desconto=======");
        System.out.println("Informe o preço do produto: ");
        double p1 = input.nextDouble();
        double d = p1 * 10 / 100;
        double desc = p1 - d;
        System.out.println("O Novo preço sera de R$:"+desc);
    }
}
