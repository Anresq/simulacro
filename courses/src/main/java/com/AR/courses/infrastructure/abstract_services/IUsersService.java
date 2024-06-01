package com.AR.courses.infrastructure.abstract_services;

import com.AR.courses.api.dto.request.UsersRequest;
import com.AR.courses.api.dto.response.UsersResponse;

public interface IUsersService extends CrudeService<UsersRequest, UsersResponse, Long> {

}
