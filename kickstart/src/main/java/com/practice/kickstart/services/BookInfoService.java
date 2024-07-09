package com.practice.kickstart.services;

import org.springframework.http.ResponseEntity;

import com.practice.kickstart.models.Book;
import com.practice.kickstart.models.BookInfo;

public interface BookInfoService {

	ResponseEntity<?> addBookInfo(BookInfo bookInfo);

	ResponseEntity<?> getBookInfo();

	ResponseEntity<?> addBookToInfo(Long bookInfoId, Book book);

}
