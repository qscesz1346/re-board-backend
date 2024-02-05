package com.re.boardback.dto.response.board;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.re.boardback.common.ResponseCode;
import com.re.boardback.common.ResponseMessage;
import com.re.boardback.dto.response.ResponseDto;
import com.re.boardback.entity.ImageEntity;
import com.re.boardback.repository.resultSet.GetBoardResultSet;

import lombok.Getter;

@Getter
public class GetBoardResponseDto extends ResponseDto {

    private int boardNumber;
    private String title;
    private String content;
    private List<String> boardImageList;
    private String writeDatetime;
    private String wrtierEmail;
    private String writerNickname;
    private String writerProfileImage;

    private GetBoardResponseDto(GetBoardResultSet resultSet, List<ImageEntity> imageEntities) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);

        List<String> boardImageList = new ArrayList<>();
        for (ImageEntity imageEntity: imageEntities) {
            String boardImage = imageEntity.getImage();
            boardImageList.add(boardImage);
        }

        this.boardNumber = resultSet.getBoardNumber();
        this.title = resultSet.getTitle();
        this.content = resultSet.getContent();
        this.boardImageList = boardImageList;
        this.writeDatetime = resultSet.getWriteDatetime();
        this.wrtierEmail = resultSet.getWriterEmail();
        this.writerNickname = resultSet.getWriterNickname();
        this.writerProfileImage = resultSet.getWriterProfileImage();
    }

    public static ResponseEntity<GetBoardResponseDto> success(GetBoardResultSet resultSet, List<ImageEntity> imageEntities) {
        GetBoardResponseDto result = new GetBoardResponseDto(resultSet, imageEntities);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> noExistBoard() {
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXISTED_BOARD, ResponseMessage.NOT_EXISTED_BOARD);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

}
