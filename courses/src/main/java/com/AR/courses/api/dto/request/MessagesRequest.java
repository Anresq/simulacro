package com.AR.courses.api.dto.request;

import java.time.LocalDate;

import com.AR.courses.domain.entities.Courses;
import com.AR.courses.domain.entities.Users;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for message request")
public class MessagesRequest {

    @NotBlank(message = "The content of the message is required")
    @Schema(description = "Content of message", example = "Hi!")
    private String message_Content;

    @NotBlank(message = "The sent date of message is required")
    @Schema(description = "sent date of message", example = "2024-11-08")
    private LocalDate sent_Date;

    @Min(value = 1, message = "The ID of the sender must be greater than zero")
    @NotNull(message = "the ID of the sender is necessary,value cannot be less than 1")
    @Schema(description = "ID of the sender", example = "1")
    private Users sender;

    @Min(value = 1, message = "The ID of the receiver must be greater than zero")
    @NotNull(message = "the ID of the receiver is necessary,value cannot be less than 1")
    @Schema(description = "ID of the receiver", example = "1")
    private Users receiver;

    @Min(value = 1, message = "The ID of the course must be greater than zero")
    @NotNull(message = "the ID of the course is necessary,value cannot be less than 1")
    @Schema(description = "ID of the course", example = "1")
    private Courses course;
}
