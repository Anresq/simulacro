package com.AR.courses.api.dto.response.basic;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "DTO for courses basic response")
public class CoursesBasicResponse {

    @Schema(description = "ID of the course", example = "1")
    private Long id_Course;
    @Schema(description = "Name of the coruse", example = "Mathematics")
    private String course_Name;
    @Schema(description = "Description of the coruse", example = "in this course we study abstract entities and their relationships such as numbers, geometric figures, and symbols.")
    private String description;
    @Schema(description = "Teacher information ", example = "ID:0")
    private UserBasicResponse teacher;
}
