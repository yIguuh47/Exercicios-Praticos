package Exercicioos;
import java.util.Scanner;
public class ReajusteSalarial {
     public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
 
        double salario;
        double novoSalario;
 
            System.out.println("Informe o salário: ");
         salario = input.nextDouble();
         
        if ((salario > 0) && (salario < 5000)) {
                    System.out.println("Esse não e´seu salario!");
        } else{
               novoSalario = salario + (salario * 0.3);
            System.out.println("O salario reajustado é:"+novoSalario);}
        
    }
}

