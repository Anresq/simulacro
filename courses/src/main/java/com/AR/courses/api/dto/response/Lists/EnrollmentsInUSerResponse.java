package com.AR.courses.api.dto.response.Lists;

import com.AR.courses.api.dto.response.basic.CoursesBasicResponse;
import com.AR.courses.api.dto.response.basic.EnrollmentBasicResponse;

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
@Schema(description = "DTO for enrolment for user")
public class EnrollmentsInUSerResponse  extends EnrollmentBasicResponse{

    private CoursesBasicResponse course;
}
