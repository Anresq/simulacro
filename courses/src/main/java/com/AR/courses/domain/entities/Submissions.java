package com.AR.courses.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "submissions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Submissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Submission;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDate submission_Date;

    @Column(nullable = false)
    private double grade;

    @ManyToOne
    @JoinColumn(name = "id_Student", referencedColumnName = "Id_User")
    private Users student;

    @ManyToOne
    @JoinColumn(name = "id_Assignment", referencedColumnName = "id_Assignment")
    private Assignments assignments;

}
