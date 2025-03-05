package com.example.dio.service;

import com.example.dio.dto.request.RegistrationRequest;
import com.example.dio.dto.request.UserResquest;
import com.example.dio.dto.response.UserResponse;
import com.example.dio.model.User;

public interface UserService {

    /**
     * Registration of new User into the system
     *
     * @param registrationRequest The request object containing user registration details.
     * @return A response object containing the newly created user's details.
     */
    public UserResponse registerUser(RegistrationRequest registrationRequest);

    /**
     * Retrieves a user by their unique ID.
     *
     * @param userId The ID of the user to retrieve.
     * @return A response object containing user details, or null if the user is not found.
     */
    UserResponse findUserById(long userId);

    /**
     * Updates an existing user by their ID.
     *
     * @param userResquest The request object containing updated user details.
     * @param userId The ID of the user to be updated.
     * @return A response object containing the updated user's details, or null if the user is not found.
     */
    UserResponse updateUserById(UserResquest userResquest, long userId);
}
