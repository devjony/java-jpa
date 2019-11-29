package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindTask {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("task");
		EntityManager manager = factory.createEntityManager();
		
		Task resultTask = manager.find(Task.class, 8L);
		System.out.println("Id e descricao da task pesquisa: " + resultTask.getId() + " - " + resultTask.getDescricao());
		
		manager.close();
		factory.close();
	}
}
