package Exercicioos;
import static java.awt.PageAttributes.MediaType.C;
import java.util.Scanner;
public class FormarTriangulo {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        	System.out.println("Digite um Numero: ");
	double A = input.nextDouble();

		System.out.println("Digite outro Numero: ");
	double B = input.nextDouble();
        
		System.out.println("Digite mais um Numero: ");
	double E = input.nextDouble();
        // se A menor que B+E e B menor que A+B e B menor que A+B ent...
          if ((A < B + E) && (B < A + B) && (B < A +B)){
              System.out.println("Os lados formam um triangulo.");
       // senão
        } else { 
              System.out.println("Os valores informados não podem formar um triângulo");}
        }
    }

