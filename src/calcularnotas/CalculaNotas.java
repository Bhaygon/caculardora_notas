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
    int ptsExtra[] = new int [5];
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
    //Eduardo
    
    public void ReceberNotas(){
        if (nomesrecebidos == true) {
        for (contador = 0; contador < nomealuno.length; contador++) {
                System.out.print("Nome do aluno: " + nomealuno[contador] + " \nNotas:");
                System.out.print("\nNota 1:");
                nota1[contador] = ler.nextInt();
                System.out.print("\nNota 2:");
                nota2[contador] = ler.nextInt();
                System.out.print("\nNota 3:");
                nota3[contador] = ler.nextInt();
                System.out.print("\nNota 4:");
                nota4[contador] = ler.nextInt();
                
       }
        notasarmazenadas = true;
        System.out.println("\nNotas Armazenadas");
        } else {
            System.out.println("Voce precisa cadastrar alunos primeiro");
        }
    }
    
    public void PontosExtra(){
        System.out.println("Pontos extras:");
        for(contador = 0; contador < nomealuno.length; contador++){
            System.out.println("Pontos extras do(a): " + nomealuno[contador]);
            ptsExtra[contador] = ler.nextInt();
        }
        
        
    }
    //Calcular média e total do aluno
    //Pedro
    public void CalcularMedia(){
        if (nomesrecebidos == true && notasarmazenadas == true) {
        for (contador = 0; contador < nomealuno.length; contador++) {
                System.out.print("Nome do aluno: " + nomealuno[contador] + "\n");
                notatotal[contador] = nota1[contador] + nota2[contador] + nota3[contador] + nota4[contador];
                media[contador] = notatotal[contador] / 4 + ptsExtra[contador];
                System.out.println("Nota total: " + notatotal[contador]);
                System.out.println("Nota média: " + media[contador]+ "\n");
                
       }
    
    
    }
}
    
    
    
}
