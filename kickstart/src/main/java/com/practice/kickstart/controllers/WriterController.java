package com.practice.kickstart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.kickstart.models.Writer;
import com.practice.kickstart.services.WriterService;

@RestController
public class WriterController {

	@Autowired
	private WriterService writerService;
	
	@PostMapping("/writer/add")
	public ResponseEntity<?> addWriter(@RequestBody Writer writer){
		return writerService.addWriter(writer);
	}
	

}
