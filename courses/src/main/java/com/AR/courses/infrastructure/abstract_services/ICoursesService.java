package com.AR.courses.infrastructure.abstract_services;

import com.AR.courses.api.dto.request.CoursesRequest;
import com.AR.courses.api.dto.response.CoursesResponse;

public interface ICoursesService extends CrudeService<CoursesRequest, CoursesResponse, Long> {

}
