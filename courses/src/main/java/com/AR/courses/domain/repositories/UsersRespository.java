package com.AR.courses.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AR.courses.domain.entities.Users;

@Repository
public interface UsersRespository extends JpaRepository<Users, Long> {

}
