package com.AR.courses.infrastructure.abstract_services;

import org.apache.catalina.connector.Response;
import org.springframework.data.domain.Page;

public interface CrudeService<REQUEST, RESPONSE, TYPE> {
    
    Page<RESPONSE> getAll(int page, int size);

    Response getById(TYPE id);

    Response create(REQUEST request);

    Response update(REQUEST request, TYPE id);

    void delete(TYPE id);

}
