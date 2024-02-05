package com.re.boardback.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="image")
@Table(name="image")
public class ImageEntity {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sequence;
    private int boardNumber;
    private String image;

    public ImageEntity(int boardNumber, String image) {
        this.boardNumber = boardNumber;
        this.image = image;
    }
    
}
