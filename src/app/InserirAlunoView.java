package app;

import java.util.Calendar;

import orm.actions.InserirAluno;
import orm.model.Aluno;

public class InserirAlunoView {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Victor");
		aluno.setEmail("victor@email.com");
		aluno.setCpf("12345678910");
		aluno.setNaturalidade(null);
		aluno.setEndereco(null);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1988, Calendar.OCTOBER, 18);
		aluno.setDataNascimento(dataNascimento);
		
		InserirAluno.add(aluno);
	}

}
