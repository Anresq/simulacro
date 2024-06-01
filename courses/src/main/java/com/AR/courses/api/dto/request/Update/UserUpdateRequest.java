package com.AR.courses.api.dto.request.Update;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for user update request")
public class UserUpdateRequest {

    @NotBlank(message = "The User Name is required")
    @Size(max = 50, message = "The User name must have a maximum of 50 characters")
    @Schema(description = "User name", example = "User1")
    private String user_Name;

    @NotBlank(message = "The password is required")
    @Size(max = 255, message = "The password must have a maximun of 255 characters")
    private String password;

    @Email
    @NotBlank(message = "The email is required")
    @Size(max = 100, message = " The Email must have a maximun of 100 characters")
    private String email;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "The full name is required")
    @Size(max = 100, message = "The full name must have a maximun of 100 characters")
    @Schema(description = "full name", example = "Ameli Angel")
    private String full_Name;

}
