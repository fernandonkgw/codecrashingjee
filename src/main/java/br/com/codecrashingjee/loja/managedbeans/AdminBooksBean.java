package br.com.codecrashingjee.loja.managedbeans;

import javax.enterprise.inject.Model;

import br.com.codecrashingjee.loja.models.Book;

@Model
public class AdminBooksBean {

	private Book product = new Book();
	
	public void save() {
		System.out.println(product);
	}
	
	public Book getProduct() {
		return product;
	}
}
