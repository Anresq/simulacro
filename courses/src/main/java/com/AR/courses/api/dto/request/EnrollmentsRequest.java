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
@Schema(description = "DTO for enrollments request")
public class EnrollmentsRequest {
    
    @NotBlank(message = "The enrollment date of assignment is required")
    @Schema(description = "Enrollment date", example = "2024-11-08")
    private LocalDate enrollment_Date;

    @Min(value = 1, message = "The ID of the student must be greater than zero")
    @NotNull(message = "the ID of the student is necessary,value cannot be less than 1")
    @Schema(description = "ID of the student", example = "1")
    private Users student;

    @Min(value = 1, message = "The ID of the course must be greater than zero")
    @NotNull(message = "the ID of the courses is necessary,value cannot be less than 1")
    @Schema(description = "ID of the course", example = "1")
    private Courses course;
}
