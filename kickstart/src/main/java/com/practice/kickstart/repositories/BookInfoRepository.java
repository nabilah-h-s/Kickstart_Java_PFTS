package com.practice.kickstart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.kickstart.models.BookInfo;

@Repository
public interface BookInfoRepository extends JpaRepository<BookInfo, Long>{

}
