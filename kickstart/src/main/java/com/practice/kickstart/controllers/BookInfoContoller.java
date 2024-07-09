package com.practice.kickstart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.practice.kickstart.models.BookInfo;
import com.practice.kickstart.services.BookInfoService;

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
}
