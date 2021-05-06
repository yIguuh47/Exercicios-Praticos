package Exercicioos;
import java.util.Scanner;
public class DivisivelPor2ou3 {
    public static void main (String[] agrs) {
     Scanner input = new Scanner (System.in);
     
           //para A=0 faça A+A até A ser menor que 4
            for (int A = 0; A<4; A++){ 
            System.out.println("Informe um Valor: ");
            int A1 = input.nextInt();
            
	    boolean divisivelPorDois = (A1%2 == 0);
	    boolean divisivelPorTres =  (A1%3 == 0);
            
            //se divisivelpordoi e divisivelportres ent..
	    if(divisivelPorDois && divisivelPorTres){
		System.out.println("O número " + A1 + " é Divisivel por 2 e 3");  
                
            //se divisivelpordois ent...
	    }else if(divisivelPorDois){
		System.out.println("O número " + A1 + " é Divisivel por 2");   
                
            //se divisivelportres ent...
	    }else if(divisivelPorTres){
		System.out.println("O número " + A1 + " é Divisivel por 3");   
            
            //senão ent..
	    }else{
		System.out.println("O número " + A1 + " não é divisivel por 2 e por 3");
	    }
	}   
    }    
}
