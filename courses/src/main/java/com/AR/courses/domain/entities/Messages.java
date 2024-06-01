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

@Entity(name = "messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Message;

    @Lob
    @Column(nullable = false)
    private String message_Content;

    @Column(nullable = false)
    private LocalDate sent_Date;

    @ManyToOne
    @JoinColumn(name = "id_Sender", referencedColumnName = "Id_User")
    private Users sender;

    @ManyToOne
    @JoinColumn(name = "id_Receiver", referencedColumnName = "Id_User")
    private Users receiver;

    @ManyToOne
    @JoinColumn(name = "id_Course", referencedColumnName = "id_Course")
    private Courses course;
}
