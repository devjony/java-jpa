package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DelTask {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("task");
		EntityManager manager = factory.createEntityManager();
		
		Task resultTask = manager.find(Task.class, 5L);
				
		manager.getTransaction().begin();
		manager.remove(resultTask);
		manager.getTransaction().commit();
		
		System.out.println("Teste del");
		System.out.println("ID da Task excluída: " + resultTask.getId());
		
		manager.close();
		factory.close();
	}
}
