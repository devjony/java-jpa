package modelo;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertTask {
	public static void main(String[] args) {
	
		Task task = new Task();
		task.setDescricao("Teste insert 4");
		task.setFinalizado(true);
		task.setDataFinalizacao(Calendar.getInstance());
		
		//Para conexao e execucao de DDL
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("task");
		
		//Para execucao de DML - operacoes CRUD - transacoes
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(task);
		manager.getTransaction().commit();
		
		System.out.println("Teste de inserção");
		System.out.println("ID da Task: " + task.getId());
		
		manager.close();
		factory.close();
	}
}
