package com.re.boardback.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.re.boardback.entity.ImageEntity;

import jakarta.transaction.Transactional;

@Repository
public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {

    List<ImageEntity> findByBoardNumber(Integer boardNumber);

    @Transactional
    void deleteByBoardNumber(Integer boardNumber);
    
}
