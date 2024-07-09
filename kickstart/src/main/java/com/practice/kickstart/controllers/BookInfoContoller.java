package com.practice.kickstart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.kickstart.models.Book;
import com.practice.kickstart.models.BookInfo;
import com.practice.kickstart.services.BookInfoService;

@RestController
public class BookInfoContoller {


	@Autowired
	private BookInfoService bookInfoService;
	
	@PostMapping("/book-info/add")
	public ResponseEntity<?> addBookInfo(@RequestBody BookInfo bookInfo){
		return bookInfoService.addBookInfo(bookInfo);
	}
	
	@PostMapping("/book-info/get")
	public ResponseEntity<?> getBookInfo(){
		return bookInfoService.getBookInfo();
	}
	
	@PostMapping("/add-book/book-info/{id}")
	public ResponseEntity<?> addBookToInfo(@PathVariable(name = "id") Long bookInfoId,
			@RequestBody Book book){
		return bookInfoService.addBookToInfo(bookInfoId, book);
	}
	
}
