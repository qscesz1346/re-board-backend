package com.re.boardback.dto.response.search;

import com.re.boardback.common.ResponseCode;
import com.re.boardback.common.ResponseMessage;
import com.re.boardback.dto.response.ResponseDto;
import com.re.boardback.repository.resultSet.GetRelationListResultSet;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Getter;

@Getter
public class GetRelationListResponseDto extends ResponseDto {

    private List<String> relativeWordList;

    private GetRelationListResponseDto(List<GetRelationListResultSet> resultSets) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);

        List<String> relativeWordList = new ArrayList<>();
        for (GetRelationListResultSet resultSet: resultSets) {
            String relativeWord = resultSet.getSearchWord();
            relativeWordList.add(relativeWord);
        }
        
        this.relativeWordList = relativeWordList;
    }

    public static ResponseEntity<GetRelationListResponseDto> success(List<GetRelationListResultSet> resultSets) {
        GetRelationListResponseDto result = new GetRelationListResponseDto(resultSets);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    
}
