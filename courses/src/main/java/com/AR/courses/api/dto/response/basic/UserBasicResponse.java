package com.AR.courses.api.dto.response.basic;

import com.AR.courses.util.enums.Role;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for user basic response")
public class UserBasicResponse {

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
}
