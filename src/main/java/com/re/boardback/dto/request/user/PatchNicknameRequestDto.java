package com.re.boardback.dto.request.user;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class PatchNicknameRequestDto {
    
    @NotBlank
    private String nickname;

}
