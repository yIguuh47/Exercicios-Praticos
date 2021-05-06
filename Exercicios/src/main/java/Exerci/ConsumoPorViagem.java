package Exerci;
import java.util.Scanner;
public class ConsumoPorViagem {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
         double n=0,distan,litr,media=0,fn,consm = 0;
         
         System.out.println("Informe o numero de viagens: ");
            //recebe o numero
            int viag = input.nextInt();
            
        //enquanto n for menor que viagem faça.
        while (n < viag){
            System.out.println("Distancia percorida em KM: ");
            //recebe o numero
            distan = input.nextInt();
            
            System.out.println("Quantidade de Gasolina Gasta: ");
            litr = input.nextInt();
            //ao finalizar o loop conte n+n até n ser maior que viag para finalizar o while.
            n++;
            //fazer o consumo de cada viagem
            consm = distan / litr;
            media = media + consm;
            System.out.println("Consumo da viagem foi de: "+consm);}
            //fazer a media entre todas as viagens
            fn= media / n;
            System.out.println("Consumo Medio Das viagens foi de:"+fn);
     }
}
