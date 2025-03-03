package com.example.dio.dto.response;

import com.example.dio.enums.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private long userId;
    private String username;
    private UserRole role;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
