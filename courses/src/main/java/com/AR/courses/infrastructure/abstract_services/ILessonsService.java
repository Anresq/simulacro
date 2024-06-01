package com.AR.courses.infrastructure.abstract_services;

import com.AR.courses.api.dto.request.LessonsRequest;
import com.AR.courses.api.dto.response.LessonsResponse;


public interface ILessonsService extends CrudeService<LessonsRequest, LessonsResponse, Long>  {
    
}
