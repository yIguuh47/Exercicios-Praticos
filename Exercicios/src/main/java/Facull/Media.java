package Facull;
import java.util.Scanner;
public class Media {
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    
        /*System.out.println("Informe o numeor de alunos:");
        int aln = input.nextInt();
        
        for (int c = 0; c<aln; c++){ //enquanto
        System.out.println("Digite Seu nome: ");
        String name [] = new String [aln];
        name[] = input.nextLine();
        
        }
    }
}*/
        int n=0, m=0, i, j;;
        System.out.println("num alunos");
        n = input.nextInt(); // numero de alunos
        System.out.println("num disciplinas");
        m = input.nextInt(); // numero de disciplinas 
        String [] a = new String[n]; // nomes dos alunos
        String [] d = new String[m]; // nomes das disciplinas
        double [][] M = new double[n][m]; // notas
        // nomes dos alunos
        for (i=0; i<n; i++) {
            System.out.println("alunos");
            a[i] = input.nextLine();
        }
        // nomes das disciplinas
        for (j=0; j<m; j++) {
            System.out.println("disciplinas");
            d[j] = input.nextLine();
        }
        // monta tabela de notas: alunos X disciplinas
        for (i=0; i<n; i++) {
            for (j=0; j<m; j++) { System.out.println("notas");
                M[i][j] = input.nextDouble();
            }            
        }
        // calcula a nota média de cada disciplina
        double soma=0, media=0;
        for (j=0; j<m; j++) {
            for (i=0; i<n; i++) {
                soma = soma + M[i][j];
            }
            media = soma/n;
            System.out.println("Média de "+d[j]+": "+media);
        }
	}
}
