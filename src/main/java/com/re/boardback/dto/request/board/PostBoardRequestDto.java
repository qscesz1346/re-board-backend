package com.re.boardback.dto.request.board;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class PostBoardRequestDto {
    
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NonNull
    private List<String> boardImageList;

}
