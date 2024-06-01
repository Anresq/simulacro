package com.AR.courses.api.dto.request;

import com.AR.courses.api.dto.request.Update.UserUpdateRequest;
import com.AR.courses.util.enums.Role;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
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
@Schema(description = "DTO for user request")
public class UsersRequest extends UserUpdateRequest {
    
    @NotBlank(message = "The role is required")
    @Schema(description = "The user can be studiant or teacher")
    private Role role;

}
