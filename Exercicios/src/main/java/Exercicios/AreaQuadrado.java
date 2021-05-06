package Exercicios;
import java.util.Scanner;
public class AreaQuadrado {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("informe o primeiro lado do Quadrado: ");
        double ld1 = input.nextDouble();
        double are = 0;
        double k = 0;
        double ld2;
        double area = 0;
        ld2 = ld1;
       while (k < 4) { 
       are = ld1 * ld2;
       area = are * ld1 ;
       k++;
       }
        System.out.println("O quadrado tem uma area de:" +area);
    }
}
