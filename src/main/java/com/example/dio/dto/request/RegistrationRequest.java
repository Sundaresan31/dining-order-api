package com.example.dio.dto.request;

import com.example.dio.enums.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationRequest {

    @NotNull(message = "Username cannot be null")
    @NotBlank(message = "Username cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Username can only contain Alphabets, Numbers and Underscore")
    private String username;

    @NotNull(message = "Email cannot be null")
    @NotBlank(message = "Email cannot be blank")
    @Email(regexp = "^[a-zA-Z0-9._-]+@gmail.com$")
    private String email;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*d)(?=.*[&*^%$#@!+-_]).{8,12}$",
            message = "Password must contain at least one lower case letter, upper case letter, number, special character among &*^%$#@!+-_ and length should should at least be 8 to max 12")
    @NotNull(message = "Password cannot be null")
    @NotBlank(message = "Password cannot be blank")
    private String password;

    @NotNull(message = "Phone number cannot be null")
    @NotBlank(message = "Phone number cannot be blank")
    @Pattern(regexp = "^[7-9]d{9}$", message = "Invalid phone number")
    private String phNo;

    private UserRole role;
}
