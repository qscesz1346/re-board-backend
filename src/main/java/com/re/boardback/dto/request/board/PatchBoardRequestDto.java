package com.re.boardback.dto.request.board;

import java.util.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class PatchBoardRequestDto {

    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NotNull
    private List<String> boardImageList;
    
}
