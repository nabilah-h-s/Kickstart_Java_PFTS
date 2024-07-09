package com.practice.kickstart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.kickstart.models.Writer;

@Repository
public interface WriterRepository extends JpaRepository<Writer, Long>{

}
