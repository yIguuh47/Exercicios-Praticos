package Exercicios;
import java.util.Scanner;
public class DataDeNascimento {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        double id;
        double dia;
        double sem;
        double mes;
        System.out.println("Digite o ano em que você nasceu: ");
        double nsc = input.nextDouble();
        id = 2020 - nsc;
        dia = id * 365;
        sem = id * 52;
        mes = id *12;
        System.out.println("Voce tem: "+id+" anos;\n"+dia+" dias;\n"+sem+" semanas e;\n"+mes+" meses de vida.");
    }
}
