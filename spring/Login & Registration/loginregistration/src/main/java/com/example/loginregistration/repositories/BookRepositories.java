package com.example.loginregistration.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.loginregistration.model.Book;
@Repository
public interface BookRepositories extends CrudRepository<Book, Long> {
	List<Book> findAll();

	
}
