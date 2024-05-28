package com.riwi.curses.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "message")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messages {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Lob
    @Column(nullable = false)
    private String messageContent;

    @Column(nullable = false)
    private LocalDate sentDate;
}
