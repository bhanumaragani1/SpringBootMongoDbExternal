package com.starter.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.document.Book;
import com.starter.repo.BookRepo;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private BookRepo repo;
	
	@Override
	public void run(String... args) throws Exception {

		repo.save(new Book("Spring", "XYZ", 2.2));
		
		
	}

}
