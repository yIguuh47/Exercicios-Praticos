package Exercicioos;
import java.util.Scanner;
import static java.lang.Math.sqrt;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Raizes {
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);	
            
	double delta, x1, x2;

		System.out.println("Digite um Numero: ");
	double A = input.nextDouble();

		System.out.println("Digite outro Numero: ");
	double B = input.nextDouble();
        
		System.out.println("Digite mais um Numero: ");
	double C = input.nextDouble();

	delta = (B*B)-4*A*C;
        //sqrt faz é o qeu faz a raiz de delta...
            double rz = java.lang.Math.sqrt(delta);
        //se delta menor que 0 então..
	if (delta < 0) {
		System.out.println("Não há raizes reais");
        
        //mas se delta maior igual a 0 então...
	} else if (delta >= 0 ){
	x1 = (float) ((-B + rz) / (2 * A));
	x2 = (float) ((-B - rz) / (2 * A));
		System.out.println("Duas raizes reais e distintas:");
		System.out.println("X1 = "+x1+" X2 = "+x2);}
	}
}   

