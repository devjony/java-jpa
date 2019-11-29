package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetTasksJPA2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("task");
		EntityManager manager = factory.createEntityManager();
		
		Query queryJPQL = manager.createQuery("SELECT t FROM Task AS t where t.finalizado = :paramFinalizado");
		
		queryJPQL.setParameter("paramFinalizado", false);
		
		@SuppressWarnings("unchecked")
		List<Task> tasks = queryJPQL.getResultList();
		for (Task task : tasks) {
			System.out.println(task.getId() +" - "+ task.getDescricao());
		}
				
		manager.close();
		factory.close();
	}
}
