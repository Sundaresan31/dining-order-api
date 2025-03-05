package com.example.dio.mapper;

import com.example.dio.dto.request.RegistrationRequest;
import com.example.dio.dto.request.UserResquest;
import com.example.dio.dto.response.UserResponse;
import com.example.dio.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {


    /**
     * Maps a User entity to a UserResponse DTO.
     *
     * @param user The user entity to map.
     * @return The mapped UserResponse DTO.
     */
    UserResponse mapToUserResponse(User user);

    /**
     * Maps a RegistrationRequest DTO to an existing User entity.
     * This method updates the user entity with the details provided in the registration request.
     *
     * @param registrationRequest The DTO containing user registration details.
     * @param user The target user entity to be updated.
     */
    void mapToUserEntity(RegistrationRequest registrationRequest, @MappingTarget User user);

    /**
     * Maps a UserResquest DTO to an existing User entity.
     * This method updates the user entity with the details provided in the user request.
     *
     * @param userResquest The DTO containing updated user details.
     * @param user The target user entity to be updated.
     */
    void mapToUserEntity(UserResquest userResquest, @MappingTarget User user);
}
