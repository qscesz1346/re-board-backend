package com.re.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.re.boardback.entity.SearchLogEntity;
import com.re.boardback.repository.resultSet.GetPopularListResultSet;
import com.re.boardback.repository.resultSet.GetRelationListResultSet;

import java.util.*;

@Repository
public interface SearchLogRepository extends JpaRepository<SearchLogEntity, Integer> {

    @Query(
        value = 
        "SELECT search_word AS searchWord, count(search_word) AS count " +
        "FROM search_log " +
        "WHERE relation IS FALSE " +
        "GROUP BY search_word " +
        "ORDER BY count DESC " +
        "LIMIT 15 ",
        nativeQuery = true
    )
    List<GetPopularListResultSet> getPopularList();

    @Query(
        value =
        "SELECT relation_word as searchWord, count(relation_word) AS count " +
        "FROM search_log " +
        "WHERE search_word = ?1 " +
        "AND relation_word IS NOT NULL " +
        "GROUP BY relation_word " +
        "ORDER BY count DESC " +
        "LIMIT 15 ",
        nativeQuery = true
    )
    List<GetRelationListResultSet> getRelationList(String searchWord);
    
}
