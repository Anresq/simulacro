package com.AR.courses.api.dto.request.Update;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "DTO for lesson update request")
public class LessonUpdateRequest {

    @NotBlank(message = "The lesson title is required")
    @Size(max = 100, message = "The lesson title must have a maximum of 100 characters")
    @Schema(description = "Lesson title", example = "two-digit sums")
    private String lesson_Title;

    @NotBlank(message = "The content of lesson is required")
    @Schema(description = "Content of lesson", example = "Learn to add two-digit numbers.")
    private String content;
}
