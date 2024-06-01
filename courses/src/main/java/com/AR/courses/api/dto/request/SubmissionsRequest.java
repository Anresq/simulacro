package com.AR.courses.api.dto.request;

import java.time.LocalDate;

import com.AR.courses.api.dto.request.Update.SubmissionUpdateRequest;
import com.AR.courses.domain.entities.Assignments;
import com.AR.courses.domain.entities.Users;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = false)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for submission request")
public class SubmissionsRequest extends SubmissionUpdateRequest {

    @NotBlank(message = "The submission date of assignment is required")
    @Schema(description = "submission date", example = "2024-11-08")
    private LocalDate submission_Date;

    @Min(value = 1, message = "The ID of the student must be greater than zero")
    @NotNull(message = "the ID of the student is necessary,value cannot be less than 1")
    @Schema(description = "ID of the student", example = "1")
    private Users student;

    @Min(value = 1, message = "The ID of the assignment must be greater than zero")
    @NotNull(message = "the ID of the assignment is necessary,value cannot be less than 1")
    @Schema(description = "ID of the assignment", example = "1")
    private Assignments assignment;
}
