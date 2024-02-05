package com.re.boardback.service;

import org.springframework.http.ResponseEntity;

import com.re.boardback.dto.request.auth.SignInRequestDto;
import com.re.boardback.dto.request.auth.SignUpRequestDto;
import com.re.boardback.dto.response.auth.SignInResponseDto;
import com.re.boardback.dto.response.auth.SignUpResponseDto;

public interface AuthService {

    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
    
}
