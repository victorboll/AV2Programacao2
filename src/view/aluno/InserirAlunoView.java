package view.aluno;

import java.util.Calendar;
import java.util.Scanner;

import orm.actions.InserirAluno;
import orm.model.Aluno;

public class InserirAlunoView {
	public static void menu(Scanner scanner) {
		String opcao;
		do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Adicionar um novo aluno ao banco de dados");
            System.out.println("2. Voltar ao menu anterior");
            
            opcao = scanner.nextLine();

            if(opcao.equals("1")) {
            	adicionar(scanner);
            } else if (!opcao.equals("2")) {
            	System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
            }     
            
            } while (!opcao.equals("2"));
    	}
	
	public static void adicionar(Scanner scanner) {
		Aluno aluno = new Aluno();
		System.out.print("Por favor, digite o nome: ");
		aluno.setNome(scanner.nextLine());
		System.out.print("Por favor, digite o email: ");
		aluno.setEmail(scanner.nextLine());
		System.out.print("Por favor, digite o cpf: ");
		aluno.setCpf(scanner.nextLine());
		System.out.print("Por favor, digite a naturalidade: ");
		aluno.setNaturalidade(scanner.nextLine());
		System.out.print("Por favor, digite o endereco: ");
		aluno.setEndereco(scanner.nextLine());
		
		System.out.print("Por favor, digite o DIA de nascimento: ");
		int dia = Integer.parseInt(scanner.nextLine());
		System.out.print("Por favor, digite o MES de nascimento: ");
		int mes = Integer.parseInt(scanner.nextLine());
		System.out.print("Por favor, digite o ANO de nascimento: ");
		int ano = Integer.parseInt(scanner.nextLine());
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(ano, mes - 1, dia);
		aluno.setDataNascimento(dataNascimento);
		
		InserirAluno.add(aluno);
	}

}
