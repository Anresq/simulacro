package com.AR.courses.api.dto.response;

import java.util.List;

import com.AR.courses.api.dto.response.Lists.LeassonInCoursesResponse;
import com.AR.courses.api.dto.response.basic.CoursesBasicResponse;
import com.AR.courses.api.dto.response.basic.LessonBasicResponse;

public class CoursesResponse extends CoursesBasicResponse {

    private List<LessonBasicResponse> lessons;
    private List<EnrollmentInCoursesResponse> enrollment;
    private List<MessagesInCoursesResponse> message;

}
