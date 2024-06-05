package com.AR.courses.api.dto.response;

import com.AR.courses.api.dto.response.basic.CoursesBasicResponse;
import com.AR.courses.api.dto.response.basic.EnrollmentBasicResponse;
import com.AR.courses.api.dto.response.basic.UserBasicResponse;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@EqualsAndHashCode(callSuper = false)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for Enrollment response")
public class EnrollmentsResponse extends EnrollmentBasicResponse{
    public UserBasicResponse user;
    public CoursesBasicResponse courses;

}
