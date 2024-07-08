package com.practice.kickstart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.kickstart.models.BookwormUser;

@Repository
public interface BookwormUserRepository extends JpaRepository<BookwormUser, Long>{

}
