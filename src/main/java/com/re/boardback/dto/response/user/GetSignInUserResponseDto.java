package com.re.boardback.dto.response.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.re.boardback.common.ResponseCode;
import com.re.boardback.common.ResponseMessage;
import com.re.boardback.dto.response.ResponseDto;
import com.re.boardback.entity.UserEntity;

import lombok.*;

@Getter
public class GetSignInUserResponseDto extends ResponseDto {

    private String email;
    private String nickname;
    private String profileImage;

    public GetSignInUserResponseDto(UserEntity userEntity) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.email = userEntity.getEmail();
        this.nickname = userEntity.getNickname();
        this.profileImage = userEntity.getProfileImage();
    }

    public static ResponseEntity<GetSignInUserResponseDto> success(UserEntity userEntity) {
        GetSignInUserResponseDto result = new GetSignInUserResponseDto(userEntity);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> notExistUser() {
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXISTED_USER, ResponseMessage.NOT_EXISTED_USER);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
    }
    
}
