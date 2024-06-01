package com.AR.courses.api.dto.response;

import java.util.List;

import com.AR.courses.api.dto.response.Lists.CoursesInUSerResponse;
import com.AR.courses.api.dto.response.Lists.EnrollmentsInUSerResponse;
import com.AR.courses.api.dto.response.Lists.MessagesReceiverInUserResponse;
import com.AR.courses.api.dto.response.Lists.MessagesSentInUserResponse;
import com.AR.courses.util.enums.Role;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "")
public class UsersResponse {

    private long Id_User;
    private String user_Name;
    private String password;
    private String email;
    private String full_Name;
    private Role role;
    private List<EnrollmentsInUSerResponse> 
    enrollements;
    private List<CoursesInUSerResponse> courses;
    private List<MessagesSentInUserResponse> messageSender;
    private
    List<MessagesReceiverInUserResponse> messageReceiver;
    ;
    
    
    
}
