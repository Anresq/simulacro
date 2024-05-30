package com.AR.courses.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "enrollments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Enrollment;

    @Column(nullable = false)
    private LocalDate enrollment_Date;

    @ManyToOne
    @JoinColumn(name = "id_Student", referencedColumnName = "id_User")
    private Users student;

    @ManyToOne
    @JoinColumn(name = "id_Course", referencedColumnName = "id_Course")
    private Courses courses;

}
