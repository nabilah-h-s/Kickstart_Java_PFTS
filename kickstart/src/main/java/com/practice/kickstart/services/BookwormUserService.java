package com.practice.kickstart.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.practice.kickstart.models.BookwormUser;

public interface BookwormUserService {

	ResponseEntity<?> add(BookwormUser bookwormUser);

	ResponseEntity<?> getAll();

	ResponseEntity<?> update(Long id, BookwormUser bookwormUser);

}
