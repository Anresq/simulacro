package com.AR.courses.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AR.courses.domain.entities.Messages;

@Repository
public interface MessagesRepository extends JpaRepository<Messages,Long> {
    
}
