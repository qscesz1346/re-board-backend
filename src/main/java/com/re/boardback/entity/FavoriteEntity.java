package com.re.boardback.entity;

import com.re.boardback.entity.primaryKey.FavoritePk;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="favorite")
@Table(name="favorite")
@IdClass(FavoritePk.class)
public class FavoriteEntity {
    
    @Id
    private String userEmail;
    @Id
    private int boardNumber;

}
