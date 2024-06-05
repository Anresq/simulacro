package com.AR.courses.api.dto.response;

import java.util.List;

import com.AR.courses.api.dto.response.Lists.EnrollmentsInUSerResponse;
import com.AR.courses.api.dto.response.Lists.MessagesReceiverInUserResponse;
import com.AR.courses.api.dto.response.Lists.MessagesSentInUserResponse;
import com.AR.courses.api.dto.response.Lists.SubmissionsInUserResponse;
import com.AR.courses.api.dto.response.basic.CoursesBasicResponse;
import com.AR.courses.api.dto.response.basic.UserBasicResponse;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Data;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for user response")
public class UsersResponse extends UserBasicResponse {

    private List<EnrollmentsInUSerResponse> enrollements;
    private List<CoursesBasicResponse> courses;
    private List<MessagesSentInUserResponse> messageSender;
    private List<MessagesReceiverInUserResponse> messageReceiver;
    private List<SubmissionsInUserResponse> submission;
}
