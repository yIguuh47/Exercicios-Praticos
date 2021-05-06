package Exercicios;
import java.util.Scanner;
public class AreaTriangulo {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.println("Informe a Base do Triangulo: ");
        double b = input.nextDouble(); 
        System.out.println("Informe a Altura do Triangulo: ");
        double a = input.nextDouble(); 
        double area = (b * a) / 2;
        System.out.println("A area é equivalente á: "+area);
    }
}
