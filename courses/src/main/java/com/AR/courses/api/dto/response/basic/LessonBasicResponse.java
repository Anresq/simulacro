package com.AR.courses.api.dto.response.basic;

import com.AR.courses.api.dto.response.CoursesResponse;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for leasson basic response")
public class LessonBasicResponse {
    @Schema(description = "ID of the lesson", example = "1")
    private Long id_Lesson;
    @Schema(description = "Title of the lesson", example = "sum")
    private String lesson_Title;
    @Schema(description = "Content of the lesson", example = "....")
    private String content;
}
