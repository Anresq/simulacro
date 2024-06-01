package com.AR.courses.infrastructure.abstract_services;

import com.AR.courses.api.dto.request.EnrollmentsRequest;
import com.AR.courses.api.dto.response.EnrollmentsResponse;


public interface IEnrollmentsService extends CrudeService<EnrollmentsRequest, EnrollmentsResponse, Long>{
    
}
