package Exercii;
import java.util.Scanner;
public class SorteioDado {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    System.out.println("Informe (0) para soprar o dado e fazer o lançamento: ");
        int dad = input.nextInt();
  //O método random() de Math retorna um valor (double) entre 0 (inclusive) e 1 (exclusive). 
  //O método nextInt(int) da classe Random vai retornar um inteiro, entre 0 (inclusive) e o número passado (exclusive).
  //No exemplo, é passado 6, então o método retornará 0, ou 1, ou 2, ou 3, ou 4, ou 5. Por isso, soma-se 1 para ajustar
  //o intervalo.
        dad = (int) (2 + ( Math.random() * 10 ));
  //Para obter o intervalo desejado, multiplica-se o retorno pelo valor máximo de itens que serão gerados (6)
  //converte-se o resultado em inteiro (int) e soma-se 1 para fazer o ajuste como no exemplo anterior.
        System.out.println( "Sorteou: " + dad );
    }
}
