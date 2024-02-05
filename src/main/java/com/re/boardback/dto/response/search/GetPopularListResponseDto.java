package com.re.boardback.dto.response.search;

import com.re.boardback.common.ResponseCode;
import com.re.boardback.common.ResponseMessage;
import com.re.boardback.dto.response.ResponseDto;
import com.re.boardback.repository.resultSet.GetPopularListResultSet;

import lombok.Getter;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class GetPopularListResponseDto extends ResponseDto {

    private List<String> popularWordList;

    private GetPopularListResponseDto(List<GetPopularListResultSet> resultSets) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);

        List<String> popularWordList = new ArrayList<>();
        for (GetPopularListResultSet resultSet: resultSets) {
            String popularWord = resultSet.getSearchWord();
            popularWordList.add(popularWord);
        }

        this.popularWordList = popularWordList;
    }

    public static ResponseEntity<GetPopularListResponseDto> success(List<GetPopularListResultSet> resultSets) {
        GetPopularListResponseDto result = new GetPopularListResponseDto(resultSets);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    
}
