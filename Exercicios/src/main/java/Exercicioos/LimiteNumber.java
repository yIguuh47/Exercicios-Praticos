package Exercicioos;
import java.util.Scanner;
public class LimiteNumber {
    	public static void main (String[] args){
            Scanner input = new Scanner (System.in);
        
            
	System.out.println("Digite um Numero: ");
	int lim = input.nextInt();
	
        //se lim maior igual a 1 e menor igual a 9 então...
        if(lim>=1 && lim<=9) {
            System.out.println("O valor está na faixa permitida");
            
        //mas se lim menor que 1 ou lim maior que 9 ent...
    } else if(lim<1 || lim>9) {
            System.out.println("O valor está fora da faixa permitida");}

    }
}

