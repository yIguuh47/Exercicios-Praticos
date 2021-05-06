package Exercicioos;
import java.util.Scanner;
public class HorariosDia {
    
    public static void main (String[] args){
     Scanner input = new Scanner(System.in);
     
        System.out.println("Informe a Hora: ");
        double hrs = input.nextDouble();
        
        if (hrs < 12 ) {
            System.out.println("Bom dia!");
            
        } else if (hrs <= 18){
            System.out.println("Boa tarde!");
            
        } else {
            System.out.println("Boa noite");
        }
        
    }
}
