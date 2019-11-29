package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateTask {

	public static void main(String[] args) {
		Task task = new Task();
				
		task.setId(8L);
		task.setDescricao("Preciso estudar JPA");
		task.setFinalizado(false);
		task.setDataFinalizacao(null);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("task");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(task);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
