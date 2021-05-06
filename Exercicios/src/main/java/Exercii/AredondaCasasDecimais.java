package Exercii;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class AredondaCasasDecimais {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		float a, b, c, delta, x1, x2;
            System.out.println("Informe um numero: ");
                double num = input.nextDouble();
            System.out.println("Informe o numero de Casas decimais aceitas: "); 
                int casas = input.nextInt();
            double arredondado = num * Math.pow(10, casas);
		arredondado += 0.5; 
		arredondado = Math.floor(arredondado);
        double slw = arredondado / Math.pow(10, casas);
            System.out.println(slw+" , "+num+" , "+casas);
    }
}
