package com.example.dio.service;

import com.example.dio.dto.request.RegistrationRequest;
import com.example.dio.dto.request.UserResquest;
import com.example.dio.dto.response.UserResponse;
import com.example.dio.model.User;

public interface UserService {
    public UserResponse registerUser(RegistrationRequest registrationRequest);

    UserResponse findUserById(long userId);

    UserResponse updateUserById(UserResquest userResquest, long userId);
}
