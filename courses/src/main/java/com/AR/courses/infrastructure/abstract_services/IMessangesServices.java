package com.AR.courses.infrastructure.abstract_services;

import com.AR.courses.api.dto.request.MessagesRequest;
import com.AR.courses.api.dto.response.MessagesResponse;

public interface IMessangesServices extends CrudeService<MessagesRequest, MessagesResponse, Long> {
    
}
