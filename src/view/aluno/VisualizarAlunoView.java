package view.aluno;

import java.util.List;
import java.util.Scanner;

import orm.actions.BuscarAluno;
import orm.model.Aluno;

public class VisualizarAlunoView {
	public static void menu(Scanner scanner) {
		String opcao;
		do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Visualizar aluno por id");
            System.out.println("2. Visualizar lista de alunos pela letra inicial do nome");
            System.out.println("3. Visualizar lista com todos os alunos");
            System.out.println("4. Voltar ao menu anterior");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                	getById(scanner);
                    break;
                case "2":
                	getAllByFirstLetter(scanner);
                    break;
                case "3":
                	getAll(scanner);
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
                    break;
            }
        } while (!opcao.equals("4"));
    } 
	
	private static void getAll(Scanner scanner) {  	  
		List<Aluno> listaAlunos = BuscarAluno.getAll();
		for (Aluno aluno : listaAlunos) {
            System.out.println("ID do aluno: " + aluno.getId());
            System.out.println("Nome do aluno: " + aluno.getNome());
            System.out.println("E-mail do aluno: " + aluno.getEmail());
            System.out.println("CPF do aluno: " + aluno.getCpf());
            System.out.println("Data de nascimento do aluno: " + aluno.getDataNascimento());
            System.out.println("Naturalidade do aluno: " + aluno.getNaturalidade());
            System.out.println("Endereço do aluno: " + aluno.getEndereco());
            System.out.println("++++++++++++++++++++++++++++++++++++++");
		}
	}

	private static void getById(Scanner scanner) {
		System.out.print("Por favor, digite o id do contato a ser listado: ");
		Aluno aluno = BuscarAluno.getById(Long.parseLong(scanner.nextLine()));
		
		System.out.println("ID do aluno: " + aluno.getId());
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("E-mail do aluno: " + aluno.getEmail());
        System.out.println("CPF do aluno: " + aluno.getCpf());
        System.out.println("Data de nascimento do aluno: " + aluno.getDataNascimento());
        System.out.println("Naturalidade do aluno: " + aluno.getNaturalidade());
        System.out.println("Endereço do aluno: " + aluno.getEndereco());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
	}
	
	private static void getAllByFirstLetter(Scanner scanner){  	  
		System.out.print("Por favor, digite a letra inicial dos alunos que serão listados: ");
		String letra = scanner.nextLine();
	
		if (letra.length() != 1) {
            System.out.println("Para que essa acao seja realizada uma, e apenas uma, letra deve ser informada.");
            return;
        }
	
		List<Aluno> listaAlunos;
		listaAlunos = BuscarAluno.getAllByFirstLetter(letra);
		for (Aluno aluno : listaAlunos) {
            System.out.println("ID do aluno: " + aluno.getId());
            System.out.println("Nome do aluno: " + aluno.getNome());
            System.out.println("E-mail do aluno: " + aluno.getEmail());
            System.out.println("CPF do aluno: " + aluno.getCpf());
            System.out.println("Data de nascimento do aluno: " + aluno.getDataNascimento());
            System.out.println("Naturalidade do aluno: " + aluno.getNaturalidade());
            System.out.println("Endereço do aluno: " + aluno.getEndereco());
            System.out.println("++++++++++++++++++++++++++++++++++++++");
		}
	}
}
