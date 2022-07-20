package com.alkemy.disneyworldspringbootapplication.auth.service;

import com.alkemy.disneyworldspringbootapplication.auth.dto.request.SignupRequest;
import com.alkemy.disneyworldspringbootapplication.auth.exception.MessageResponse;

public interface RegisterService {
    MessageResponse register(SignupRequest signupRequest);
}
