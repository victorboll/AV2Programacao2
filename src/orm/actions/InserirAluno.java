package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class InserirAluno {
	
	public static void add(Aluno aluno) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit();
		System.out.println("Tarefa inserida, ID: " + aluno.getId());
		
		manager.close();
		factory.close();
	}

}
