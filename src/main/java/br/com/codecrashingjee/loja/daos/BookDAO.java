package br.com.codecrashingjee.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.codecrashingjee.loja.models.Book;

public class BookDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void save(Book product) {
		manager.persist(product);
	}
}
