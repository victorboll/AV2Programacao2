package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class RemoverAlunoPorId {
	public static void deleteById(Long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		Aluno aluno = manager.find(Aluno.class, id);
		manager.getTransaction().begin();
		manager.remove(aluno);
		manager.getTransaction().commit();
				
		manager.close();
		factory.close();
	}
}
