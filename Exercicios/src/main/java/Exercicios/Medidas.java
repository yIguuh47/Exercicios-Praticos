package Exercicios;
import java.util.Scanner;
public class Medidas {
    public static void main (String[]args){
       Scanner input = new Scanner (System.in);
        System.out.println("Informe a medida de pés: ");
        double p = input.nextDouble();
        double pole;
        double jar;
        double milh;
        
        pole = p * 12;
        jar = p / 3;
        milh = jar / 1760 ;
        System.out.println("As medidas são:\n"+p+" pés \n"+pole+" polegadas.\n"+jar+" jardas.\n"+milh+" milhas.");
    }
}
