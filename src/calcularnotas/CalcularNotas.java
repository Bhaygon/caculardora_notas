package calcularnotas;

import java.util.Scanner;

public class CalcularNotas {

    public static void main(String[] args) {

        //Variaveis e etc
        int opcao = 0;
        CalculaNotas CalculaNotas = new CalculaNotas();
        Scanner ler = new Scanner(System.in);
        
        //Menu
        while (opcao < 4) {
            System.out.println("\n\nCalculo de Notas, Menu: \n");
            System.out.println("1 - Cadastrar Alunos\n2 - Cadastar Notas\n3 - Calcular Medias\n4 - Sair");
                opcao = ler.nextInt();    
       
        switch (opcao) {
                case 1:
                    
                    CalculaNotas.CadastrarAlunos();
                    break;
                case 2:
                    
                    CalculaNotas.PontosExtra();
                    break;       
                case 3:
                    
                    CalculaNotas.CalcularMedia();
                    break;       
                case 4:
                    
                    System.out.println("\nProgama encerrado\n");
                    
            }
    }
        
    }
    
}
