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
@Schema(description = "DTO for course update request")
public class CourseUpdateRequest {

    @NotBlank(message = "The course name is required")
    @Size(max = 100, message = "The course name must have a maximum of 100 characters")
    @Schema(description = "Course name", example = "Math")
    private String course_Name;

    @NotBlank(message = "The description of course is required")
    @Schema(description = "Course description", example = "Apply mathematical concepts to solve theoretical and practical problems")
    private String description;

}
