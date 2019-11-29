package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetTasksJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("task");
		EntityManager manager = factory.createEntityManager();
		
		String queryJPQL = "SELECT t FROM Task AS t where t.finalizado = true"; 
		
		List<Task> tasks = manager.createQuery(queryJPQL).getResultList();
		for (Task task : tasks) {
			System.out.println(task.getId() +" - "+ task.getDescricao());
		}
				
		manager.close();
		factory.close();
	}
}
