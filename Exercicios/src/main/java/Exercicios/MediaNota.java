package Exercicios;
import java.util.Scanner;
public class MediaNota {
    public static void main (String[]args){
    Scanner input = new Scanner (System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = input.nextDouble();
        System.out.println("Digite a  nota: ");
        double n3 = input.nextDouble();
        double nf = n1 + n2 + n3;
        double m = nf / 3;
        System.out.println("Sua Média é de: "+m);
    }
}
