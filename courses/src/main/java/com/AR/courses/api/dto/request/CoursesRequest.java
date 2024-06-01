package com.AR.courses.api.dto.request;

import com.AR.courses.api.dto.request.Update.CourseUpdateRequest;
import com.AR.courses.domain.entities.Users;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
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
@Schema(description = "DTO for course request")
public class CoursesRequest extends CourseUpdateRequest {

    @Min(value = 1, message = "The ID of the teacher must be greater than zero")
    @NotNull(message = "the ID of the teacher is necessary,value cannot be less than 1")
    @Schema(description = "ID of the teacher", example = "1")
    private Users teacher;

}
