package Testes;
import java.util.Scanner;
public class Comota {
	public static void main(String[] args) {
            
	    Scanner input = new Scanner (System.in);
	    
	    int ary;
	    
		System.out.println("how are you?\n For (1)'Good!'\n For (2)'Bad!'");
		ary = input.nextInt();
		
		if (ary == 1){
		    System.out.println("Oh nice!");
		} else {
		    System.out.println("Oh get well!");
		}
	}
}

