package com.riwi.curses.domain.entities;

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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "assignment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Assignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Assignments;

    @Column(nullable = false, length = 100)
    private String assignmentTitle;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate due_Date;

    @OneToOne
    @JoinColumn(name = "id_lesson", referencedColumnName = "id_Lessons")
    private Lessons lessons;

    @OneToMany(mappedBy = "assignment", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false) 
    private List<Submissions> submissions;
    


}
