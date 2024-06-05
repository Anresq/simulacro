package com.AR.courses.api.dto.response;

import java.util.List;

import com.AR.courses.api.dto.response.basic.LessonBasicResponse;
import com.AR.courses.domain.entities.Assignments;

import io.swagger.v3.oas.annotations.media.Schema;

public class LessonsResponse extends LessonBasicResponse {

    @Schema(description = "Information of the course", example = "ID:1")
    private CoursesResponse courses;
    @Schema(description = "Assignments of the course", example = "ID:1")
   private List<AssignmentsInLessonResponse> assignments;


}
