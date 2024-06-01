package com.AR.courses.api.dto.request.Update;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for assignments update request")
public class AssignmentUpdateRequest {
    
    @NotBlank(message = "The assignment title is required")
    @Size(max = 100, message = "The assigment title must have a maximum of 100 characters")
    @Schema(description = "Assigment title", example = "two-digit sums")
    private String assignment_Title;

    @Column(nullable = false)
    @NotBlank(message = "The description of assignment is required")
    @Schema(description = "Assignment description", example = "Apply mathematical concepts to solve theoretical and practical problems")
    private String description;

    @NotBlank(message = "The due date of assignment is required")
    @Schema(description = "Due date", example = "2024-11-08")
    private LocalDate due_Date;
}
