package Exerci;
import java.util.Scanner;
public class SenhaSimples {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
   
    int senh;

        do {
            System.out.println("Digite uma senha: ");
                senh = input.nextInt();
            System.out.println("Senha incorreta!!");
            System.out.println("-----ERR0R404----");
        } while(senh != 1234);
            System.out.println("Senha correta, acesso liberado.");
            //enquanto senha for diferente  da correta faça "digite uma senha..."
    }
}
