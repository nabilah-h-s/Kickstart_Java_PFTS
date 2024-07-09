package com.practice.kickstart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.practice.kickstart.models.Writer;
import com.practice.kickstart.repositories.WriterRepository;

@Service
public class WriterServiceImpl implements WriterService{
	
	@Autowired
	private WriterRepository writerRepository;
	
	public ResponseEntity<?> addWriter(Writer writer){
		return ResponseEntity.ok(writerRepository.save(writer));
	}

	

}
