package com.AR.courses.api.dto.response.basic;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for Enrollment basic response")
public class EnrollmentBasicResponse {

    @Schema(description = "ID of the user", example = "1")
    private Long id_Enrollment;
    @Schema(description = "Date of enrollment of corse ", example = "1")
    private LocalDate enrollment_Date;
    
}
