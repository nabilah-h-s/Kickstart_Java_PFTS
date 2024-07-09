package com.practice.kickstart.services;

import org.springframework.http.ResponseEntity;

import com.practice.kickstart.models.Writer;

public interface WriterService {

	ResponseEntity<?> addWriter(Writer writer);

}
