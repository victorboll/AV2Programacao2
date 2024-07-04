package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;


public class BuscarAluno {
	public static List<Aluno> getAll(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "select a from Aluno a";
		
		Query query = manager.createQuery(sql);
		
		@SuppressWarnings("unchecked")
		List<Aluno> listaAlunos = query.getResultList();
		
        manager.close();
        factory.close();
		
		return listaAlunos;
	}
	
    public static Aluno getById(Long id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        
        Aluno aluno = manager.find(Aluno.class, id);
        
        manager.close();
        factory.close();
        
        return aluno;
    }
    
    public static List<Aluno> getAllByFirstLetter(String letra){
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "SELECT a FROM Aluno a WHERE a.nome LIKE :letter";
        
        Query query = manager.createQuery(sql);
        query.setParameter("letter", letra + "%");
        
        List<Aluno> listaAlunos = query.getResultList();
        
        manager.close();
        factory.close();
		
		return listaAlunos;
    }

}
