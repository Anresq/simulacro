package com.AR.courses.api.dto.request.Update;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for submission update request")
public class SubmissionUpdateRequest {

    @NotBlank(message = "The content of submission is required")
    @Schema(description = "Content of submission", example = "Learn to add two-digit numbers.")
    private String content;

    @NotBlank(message = "The grade of submission is required")
    @Schema(description = "Grade of submission", example = "4.5")
    private double grade;

}
