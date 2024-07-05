package view.aluno;

import java.util.Scanner;

import orm.actions.RemoverAlunoPorId;

public class RemoverAlunoView {
	public static void menu(Scanner scanner) {
		String opcao;
		do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Remover um aluno do banco de dados");
            System.out.println("2. Voltar ao menu anterior");
            
            opcao = scanner.nextLine();

            if(opcao.equals("1")) {
            	remover(scanner);
            } else if (!opcao.equals("2")) {
            	System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
            }     
            
            } while (!opcao.equals("2"));
    	} 
	
	private static void remover(Scanner scanner) {  	  
	    System.out.print("Por favor, digite o id do aluno a ser removido: ");	    
	    RemoverAlunoPorId.deleteById(Long.parseLong(scanner.nextLine()));
	}

}
