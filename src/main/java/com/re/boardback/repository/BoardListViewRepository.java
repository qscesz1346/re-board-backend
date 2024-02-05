package com.re.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.re.boardback.entity.BoardListViewEntity;

import java.util.*;
import java.util.List;


@Repository
public interface BoardListViewRepository extends JpaRepository<BoardListViewEntity, Integer> {

    List<BoardListViewEntity> findByOrderByWriteDatetimeDesc();
    List<BoardListViewEntity> findTop3ByWriteDatetimeGreaterThanOrderByFavoriteCountDescCommentCountDescViewCountDescWriteDatetimeDesc(String writeDatetime);
    List<BoardListViewEntity> findByTitleContainsOrContentContainsOrderByWriteDatetimeDesc(String title, String content);
    List<BoardListViewEntity> findByWriterEmailOrderByWriteDatetimeDesc(String writerEmail);
    
}
