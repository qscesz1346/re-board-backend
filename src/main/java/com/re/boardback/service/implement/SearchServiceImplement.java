package com.re.boardback.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.re.boardback.dto.response.ResponseDto;
import com.re.boardback.dto.response.search.GetPopularListResponseDto;
import com.re.boardback.dto.response.search.GetRelationListResponseDto;
import com.re.boardback.repository.SearchLogRepository;
import com.re.boardback.repository.resultSet.GetPopularListResultSet;
import com.re.boardback.repository.resultSet.GetRelationListResultSet;
import com.re.boardback.service.SearchService;

import lombok.RequiredArgsConstructor;

import java.util.*;

@Service
@RequiredArgsConstructor
public class SearchServiceImplement implements SearchService {

    private final SearchLogRepository searchLogRepository;

    @Override
    public ResponseEntity<? super GetPopularListResponseDto> getPopularList() {

        List<GetPopularListResultSet> resultSets = new ArrayList<>();
        
        try {

            resultSets = searchLogRepository.getPopularList();
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return GetPopularListResponseDto.success(resultSets);

    }

    @Override
    public ResponseEntity<? super GetRelationListResponseDto> getRelationList(String searchWord) {

        List<GetRelationListResultSet> resultSets = new ArrayList<>();
        
        try {

            resultSets = searchLogRepository.getRelationList(searchWord);
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return GetRelationListResponseDto.success(resultSets);

    }
    
}
