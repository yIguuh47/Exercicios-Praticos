package Exercii;
 import java.util.Scanner;
public class BinarioParaReal {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in); 
        System.out.println("Digite um número Binário : ");
        String num = input.nextLine();//line para string..
        
        int decimal = Integer.parseInt(num, 2);
    //converte string para inteiro com base 2, a base pode ser mudada...
        System.out.println("Você digitou "+num+", e seu referente decimal é: "+decimal);
    }
}