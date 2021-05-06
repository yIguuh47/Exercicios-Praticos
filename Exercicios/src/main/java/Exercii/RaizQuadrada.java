package Exercii;
import java.util.Scanner;
public class RaizQuadrada {
	public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
		float a, b, c, delta, x1, x2;

	System.out.println("\n Digite o Valor de A ");
                a = input.nextFloat();
	System.out.println("\n Digite o Valor de B ");
                b = input.nextFloat();
	System.out.println("\n Digite o Valor de C ");
                c = input.nextFloat();
               
	delta = b * b - 4 * a * c;
	if (delta > 0) {
	x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a)); // soma
        x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a)); // subtrai
        // x"Math.sqrt calcula a raiz, raiz do reaultado de delta
            System.out.println("\n Valor de X' e = " + x1+ "\n Valor de X'' e = " + x2);
		} else {
            System.out.println("Não e possivel calcular esta Raiz, não e um numero real ");
	}
    }
}