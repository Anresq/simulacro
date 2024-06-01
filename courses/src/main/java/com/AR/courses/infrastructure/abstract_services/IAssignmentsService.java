package com.AR.courses.infrastructure.abstract_services;

import com.AR.courses.api.dto.request.AssignmentsRequest;
import com.AR.courses.api.dto.response.AssignmentsResponse;


public interface IAssignmentsService extends CrudeService<AssignmentsRequest, AssignmentsResponse , Long > {
    
}
