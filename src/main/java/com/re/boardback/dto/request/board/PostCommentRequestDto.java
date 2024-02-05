package com.re.boardback.dto.request.board;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class PostCommentRequestDto {

    @NotBlank
    private String content;
    
}
