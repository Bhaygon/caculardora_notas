package calcularnotas;

import java.util.Scanner;

public class CalculaNotas {
    
    String nomealuno[] = new String [5];
    int contador;
    int nota1[] = new int [5];
    int nota2[] = new int [5];
    int nota3[] = new int [5];
    int nota4[] = new int [5];
    int notatotal[] = new int [5];
    int media[] = new int [5];
    Boolean nomesrecebidos;
    Boolean notasarmazenadas;
    
    Scanner ler = new Scanner(System.in);
    
    //Enviar nomes dos alunos
    
    public void CadastrarAlunos(){
            
        System.out.println("Digite Nome dos alunos: ");
        
        for (contador = 0; contador < nomealuno.length; contador++) {
                System.out.print("Nome do aluno: \n");
                nomealuno[contador] = ler.nextLine();
       }
       nomesrecebidos = true;
       System.out.println("\nNomes Armazenados");
    }
    
    //Enviar Notas
    
    public void CadastrarNotas(){
        if (nomesrecebidos == true) {
        for (contador = 0; contador < nomealuno.length; contador++) {
                System.out.print("Nome do aluno: " + nomealuno[contador] + " Notas: \n");
                nota1[contador] = ler.nextInt();
                nota2[contador] = ler.nextInt();
                nota3[contador] = ler.nextInt();
                nota4[contador] = ler.nextInt();
                
       }
        notasarmazenadas = true;
        System.out.println("\nNotas Armazenadas");
        } else {
            System.out.println("Voce precisa cadastrar alunos primeiro");
        }
    }
    //Calcular média e total do aluno
    public void CalcularNotas(){
        if (nomesrecebidos == true && notasarmazenadas == true) {
        for (contador = 0; contador < nomealuno.length; contador++) {
                System.out.print("Nome do aluno: " + nomealuno[contador] + "\n");
                notatotal[contador] = nota1[contador] + nota2[contador] + nota3[contador] + nota4[contador];
                media[contador] = notatotal[contador] / 4;
                System.out.println("Nota total: " + notatotal[contador]);
                System.out.println("Nota média: " + media[contador]+ "\n");
                
       }
    
    
    }
}
}
