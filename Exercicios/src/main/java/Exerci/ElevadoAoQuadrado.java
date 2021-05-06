package Exerci;
import java.util.Scanner;
public class ElevadoAoQuadrado {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);

        int  num=1;
        double quadra;
        
        //enquanto numero for maior que 0 faça.
        while (num > 0){
            System.out.println("Entre com numero: ");
            //recebe o numero
            num = input.nextInt();
            //eleva ao quadrado.
            quadra = num * num;
           
        System.out.println("numero: " +num+" ao quadrado: "+quadra);
    }
 }
}

