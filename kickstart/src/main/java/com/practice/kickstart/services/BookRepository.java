package com.practice.kickstart.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.kickstart.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
