package com.re.boardback.service;

import org.springframework.http.ResponseEntity;

import com.re.boardback.dto.request.user.PatchNicknameRequestDto;
import com.re.boardback.dto.request.user.PatchProfileImageRequestDto;
import com.re.boardback.dto.response.user.GetSignInUserResponseDto;
import com.re.boardback.dto.response.user.GetUserResponseDto;
import com.re.boardback.dto.response.user.PatchNicknameResponseDto;
import com.re.boardback.dto.response.user.PatchProfileImageResponseDto;

public interface UserService {

    ResponseEntity<? super GetUserResponseDto> getUser(String email);
    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email); 
    ResponseEntity<? super PatchNicknameResponseDto> patchNickname(PatchNicknameRequestDto dto, String email);
    ResponseEntity<? super PatchProfileImageResponseDto> patchProfileImage(PatchProfileImageRequestDto dto, String email);
    
}
