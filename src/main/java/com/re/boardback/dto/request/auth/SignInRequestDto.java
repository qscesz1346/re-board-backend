package com.re.boardback.dto.request.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class SignInRequestDto {

    @NotBlank
    private String email;
    @NotBlank
    private String password;
    
}
