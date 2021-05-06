package Exerci;
import java.util.Scanner;
public class Datas {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
    /*int Total, Dia, Mes, Ano;
         
        System.out.println("Informe o ano de 2000 a 2010: ");
            Ano = input.nextInt();
            //escolha (numero) {
            switch(Ano) {
                //caso numero escolhido = 0: escreva "Zero"; parar...
                  case 2000: System.out.println("Dois mil"); break;
                //caso numero escolhido = 1: escreva "Um"; parar...
                  case 2001: System.out.println("Dois mil e Um"); break;
                //caso numero escolhido = 2: escreva "Dois"; parar...
                  case 2002: System.out.println("Dois mil e Dois"); break;
                  case 2003: System.out.println("Dois mil e Tres"); break;
                  case 2004: System.out.println("Dois mil e Quatro"); break;
                  case 2005: System.out.println("Dois mil e Cinco"); break;
                  case 2006: System.out.println("Dois mil e Seis"); break;
                  case 2007: System.out.println("Dois mil e Sete"); break;
                  case 2008: System.out.println("Dois mil e Oito"); break;
                  case 2009: System.out.println("Dois mil e Nove"); break;
                  case 2010: System.out.println("Dois mil e Dez"); break;
                //senão : escreva "numero invalido";}
                  default: System.out.println("Ano inválido!");}
            
            
            System.out.println("Informe o mês: ");
            Mes = input.nextInt();
            //escolha (numero) {
            switch(Mes) {
                //caso numero escolhido = 0: escreva "Zero"; parar...
                  case 1: System.out.println("Janeiro"); break;
                //caso numero escolhido = 1: escreva "Um"; parar...
                  case 2: System.out.println("Fevereiro"); break;
                //caso numero escolhido = 2: escreva "Dois"; parar...
                  case 3: System.out.println("Marco"); break;
                  case 4: System.out.println("Abril"); break;
                  case 5: System.out.println("Maio"); break;
                  case 6: System.out.println("Junho"); break;
                  case 7: System.out.println("Julho"); break;
                  case 8: System.out.println("Agosto"); break;
                  case 9: System.out.println("Setembro"); break;
                  case 10: System.out.println("Outubro"); break;
                  case 11: System.out.println("Novembro"); break;
                  case 12: System.out.println("Dezembro"); break;
                //senão : escreva "numero invalido";}
                  default: System.out.println("Mês inválido!");}

        
            System.out.println("Informe um número inteiro de 0 a 10: ");
            Dia = input.nextInt();
            //escolha (numero) {
            switch(Dia) {
                //caso numero escolhido = 1: escreva "Um"; parar...
                  case 1: System.out.println("Um"); break;
                //caso numero escolhido = 2: escreva "Dois"; parar...
                  case 2: System.out.println("Dois"); break;
                  case 3: System.out.println("Tres"); break;
                  case 4: System.out.println("Quatro"); break;
                  case 5: System.out.println("Cinco"); break;
                  case 6: System.out.println("Seis"); break;
                  case 7: System.out.println("Sete"); break;
                  case 8: System.out.println("Oito"); break;
                  case 9: System.out.println("Nove"); break;
                  case 10: System.out.println("Dez"); break;
                  case 11: System.out.println("Onze"); break;
                  case 12: System.out.println("Onze"); break;
                  case 13: System.out.println("Onze"); break;
                  case 14: System.out.println("Onze"); break;
                  case 15: System.out.println("Onze"); break;
                  case 16: System.out.println("Onze"); break;
                  case 17: System.out.println("Onze"); break;
                  case 18: System.out.println("Onze"); break;
                  case 19: System.out.println("Onze"); break;
                  case 20: System.out.println("Onze"); break;
                  case 21: System.out.println("Onze"); break;
                  case 22: System.out.println("Onze"); break;
                  case 23: System.out.println("Onze"); break;
                  case 24: System.out.println("Onze"); break;
                  case 25: System.out.println("Onze"); break;
                  case 26: System.out.println("Onze"); break;
                  case 27: System.out.println("Onze"); break;
                  case 28: System.out.println("Onze"); break;
                  case 29: System.out.println("Onze"); break;
                  case 30: System.out.println("Onze"); break;
                  case 31: System.out.println("Onze"); break;
                //senão : escreva "numero invalido";}
                  default: System.out.println("Dia inválido!");}
            System.out.println(Dia+" do "+Mes+" de"+Ano);
    }
}
*/ 	
		int dia, mes, ano;
		String nomeMes;
		
		System.out.println("\nEste programa le uma data em numeros e mostra a mesma data com o mes por extenso.\n");
		
                System.out.println("Insira as informações numericas:");
		System.out.println("Dia : ");
		dia = input.nextInt();
		System.out.println("Mes: ");
		mes = input.nextInt();
		System.out.println("Ano: ");
		ano = input.nextInt();
		
		switch(mes) {
			case 1: nomeMes = "Janeiro"; break;
			case 2: nomeMes = "Fevereiro"; break;
			case 3: nomeMes = "Março"; break;
			case 4: nomeMes = "Abril"; break;
			case 5: nomeMes = "Maio"; break;
			case 6: nomeMes = "Junho"; break;
			case 7: nomeMes = "Julho"; break;
			case 8: nomeMes = "Agosto"; break;
			case 9: nomeMes = "Setembro"; break;
			case 10: nomeMes = "Outubro"; break;
			case 11: nomeMes = "Novembro"; break;
			case 12: nomeMes = "Dezembro"; break;
			default: nomeMes = ""; // Necessario, pois caso contrario a variavel pode ficar sem valor quando o usuario digitar valores invalidos para o mes (como -1 ou 14, por exemplo).
		}
		
		System.out.printf("\nDATA = %d de %s de %d\n", dia, nomeMes, ano);
	}
}