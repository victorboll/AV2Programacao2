package view.aluno;

import java.util.Scanner;

import orm.actions.AtualizarAlunoPorId;
import orm.actions.BuscarAluno;
import orm.model.Aluno;

public class AtualizarAlunoView {
	public static void menu(Scanner scanner) {
		String opcao;
		do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Alterar um aluno na base de alunos");
            System.out.println("2. Voltar ao menu anterior");
            
            opcao = scanner.nextLine();

            if(opcao.equals("1")) {
            	put(scanner);
            } else if (!opcao.equals("2")) {
            	System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
            }     
            
            } while (!opcao.equals("2"));
    	}
	
	private static void put(Scanner scanner) {  	  
		
		System.out.print("Por favor, digite o id do aluno a ser listado: ");
		Long id = Long.parseLong(scanner.nextLine());
		Aluno aluno = BuscarAluno.getById(id);
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Informe o novo nome do aluno ou deixe em branco caso não queira modificar: ");
		String input = scanner.nextLine();
	    aluno.setNome(input.isEmpty() ? aluno.getNome() : input);
	        
	    System.out.println("E-mail do aluno: " + aluno.getEmail());
		System.out.println("Informe o novo e-mail do aluno ou deixe em branco caso não queira modificar: ");
		input = scanner.nextLine();
	    aluno.setEmail(input.isEmpty() ? aluno.getEmail() : input);
	    
	    System.out.println("CPF do aluno: " + aluno.getCpf());
		System.out.println("Informe o novo CPF do aluno ou deixe em branco caso não queira modificar: ");
		input = scanner.nextLine();
	    aluno.setCpf(input.isEmpty() ? aluno.getCpf() : input);
			
	    System.out.println("Naturalidade do aluno: " + aluno.getNaturalidade());
		System.out.println("Informe a nova naturalidade do aluno ou deixe em branco caso não queira modificar: ");
		input = scanner.nextLine();
	    aluno.setNaturalidade(input.isEmpty() ? aluno.getNaturalidade() : input);
	    
	    System.out.println("Endereço do aluno: " + aluno.getEndereco());
		System.out.println("Informe o novo endereço do aluno ou deixe em branco caso não queira modificar: ");
		input = scanner.nextLine();
	    aluno.setEndereco(input.isEmpty() ? aluno.getEndereco() : input);
	    
	    AtualizarAlunoPorId.putById(aluno);
	}
}

