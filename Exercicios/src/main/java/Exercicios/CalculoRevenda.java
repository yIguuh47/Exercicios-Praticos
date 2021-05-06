package Exercicios;
import java.util.Scanner;
public class CalculoRevenda {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o preço de Fabria do Automovel: ");
        double pre = input.nextDouble();
        System.out.println("Digite o percentual de Lucro: ");
        double pc1 = input.nextDouble();
        System.out.println("Digite o percentual de Impostos: ");
        double pc2 = input.nextDouble();
        double lc;
        double cx2;
        double tot;
        lc = pre * pc1 / 100;
        cx2 = pre * pc2 / 100;
        tot = pre + cx2 + lc;
        System.out.println("O lucro do distribuidor será de:"+lc+"\nO valor correspondente aos impostos é de:"+cx2);
        System.out.println("O preço final será de: "+tot);
    }
}
