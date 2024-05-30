package com.AR.courses.domain.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "assignments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Assignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Assignment;

    @Column(nullable = false, length = 100)
    private String assignment_Title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate due_Date;

    @ManyToOne
    @JoinColumn(name = "id_Lesson", referencedColumnName = "id_Lesson")
    private Lessons lessons;

    @OneToMany(mappedBy = "assignments", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Submissions> submissions;

}
