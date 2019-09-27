// by Joe K 27/09/19
package com.kinahanj.spring.service;

import java.util.List;

import com.kinahanj.spring.model.Book;

public interface BookService {

	long save(Book book);
	
	Book get(Long id);
	
	//get all the records
	List<Book> list();
	
	//update a record
	void update(long id, Book book);
	
	//delete a record
	void delete(long id);
}
