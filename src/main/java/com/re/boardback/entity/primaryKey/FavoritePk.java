package com.re.boardback.entity.primaryKey;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavoritePk implements Serializable {
    
    @Column(name="user_email")
    private String userEmail;
    @Column(name="board_number")
    private int boardNumber;

}
