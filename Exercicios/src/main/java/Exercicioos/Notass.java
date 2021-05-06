package Exercicioos;
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
public class Notass {
   public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
          
          double notatrab,media,avalia,exame;
                  
          System.out.println("Informe a nota do trabalho: ");
                notatrab = input.nextDouble();
          
          System.out.println("Informe a nota da avaliação semestral: ");
                avalia = input.nextDouble();
                
          System.out.println("Informe a nota do exame: ");
                exame = input.nextDouble();
                
          media = (notatrab*2 +avalia*3 + exame*5)/10;
          
          if (media <= 5){
              System.out.println("Nota:"+media+" e Conceito: E");
              
         } else if (media <= 6) {
        System.out.println("Nota:"+media+" e Conceito: D");
        
    } else if (media <= 7) {
        System.out.println("Nota:"+media+" e Conceito: C");
        
    } else if (media <= 8) {
        System.out.println("Nota:"+media+" e Conceito: B");
        
    } else {
        System.out.println("Nota:"+media+" e Conceito: A");}
          
        }
    }