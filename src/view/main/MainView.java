package view.main;

import java.util.Scanner;

import view.aluno.AtualizarAlunoView;
import view.aluno.InserirAlunoView;
import view.aluno.RemoverAlunoView;
import view.aluno.VisualizarAlunoView;

public class MainView {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
         
        do {
            System.out.println("Menu Principal:");
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Visualizar aluno");
            System.out.println("3. Alterar aluno");
            System.out.println("4. Deletar aluno");
            System.out.print("Digite sua escolha ou 'x' para sair do programa:\n");
            opcao = scanner.nextLine().toLowerCase();

            switch (opcao) {
                case "1":
                    InserirAlunoView.menu(scanner);
                    break;
                case "2":
                    VisualizarAlunoView.menu(scanner);
                    break;
                case "3":
                    AtualizarAlunoView.menu(scanner);
                    break;
                case "4":
                    RemoverAlunoView.menu(scanner);
                    break;
                case "x":
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
                    break;
            }
        } while (!opcao.equals("x"));

        scanner.close();
    }
}