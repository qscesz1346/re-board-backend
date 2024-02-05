package com.re.boardback.dto.response.board;

import com.re.boardback.common.ResponseCode;
import com.re.boardback.common.ResponseMessage;
import com.re.boardback.dto.object.BoardListItem;
import com.re.boardback.dto.response.ResponseDto;
import com.re.boardback.entity.BoardListViewEntity;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Getter;

@Getter
public class GetLatestBoardListResponseDto extends ResponseDto {

    private List<BoardListItem> latestList;
    
    private GetLatestBoardListResponseDto(List<BoardListViewEntity> boardEntities) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.latestList = BoardListItem.getList(boardEntities);
    }

    public static ResponseEntity<GetLatestBoardListResponseDto> success(List<BoardListViewEntity> boardEntities) {
        GetLatestBoardListResponseDto result = new GetLatestBoardListResponseDto(boardEntities);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
