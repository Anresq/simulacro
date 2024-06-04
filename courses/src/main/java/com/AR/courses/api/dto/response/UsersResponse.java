package com.AR.courses.api.dto.response;

import java.util.List;

import com.AR.courses.api.dto.response.Lists.CoursesInUSerResponse;
import com.AR.courses.api.dto.response.Lists.EnrollmentsInUSerResponse;
import com.AR.courses.api.dto.response.Lists.MessagesReceiverInUserResponse;
import com.AR.courses.api.dto.response.Lists.MessagesSentInUserResponse;
import com.AR.courses.api.dto.response.Lists.SubmissionsInUserResponse;
import com.AR.courses.util.enums.Role;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.EqualsAndHashCode;
import lombok.Data;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for course request")
public class UsersResponse extends U {
    @Schema(description = "ID of the user", example = "1")
    private long Id_User;
    @Schema(description = "User name of the user", example = "Person1")
    private String user_Name;
    @Schema(description = "Email of the user", example = "Person@gmail.com")
    private String email;
    @Schema(description = "Full name of the user", example = "Adrian Mendez")
    private String full_Name;
    @Schema(description = "Role of the user", example = "Student")
    private Role role;
    private List<EnrollmentsInUSerResponse> enrollements;
    private List<CoursesInUSerResponse> courses;
    private List<MessagesSentInUserResponse> messageSender;
    private List<MessagesReceiverInUserResponse> messageReceiver;
    private List<SubmissionsInUserResponse> submission;
}
