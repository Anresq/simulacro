package com.riwi.curses.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "enrollment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnrollments;

    @Column(nullable=false)
    private LocalDate enrollmentDate;
    
    @ManyToMany
    @JoinColumn(name= "id_Student" , referencedColumnName = "id_User")
    private User user;
    
}
