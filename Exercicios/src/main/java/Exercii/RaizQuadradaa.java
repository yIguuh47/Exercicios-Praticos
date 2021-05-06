package Exercii;
 import java.util.Scanner;
public class RaizQuadradaa {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         int qua=0,x=1;
         while (x <= 100){
             qua = (int) Math.sqrt (x);
         System.out.println("A raiz quadrada de "+x+" é: "+qua);
         x++;
         }
    }
}
