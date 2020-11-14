package com.andrius.easyGift.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "gifts")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "giftId")
    private Long giftId;

    @Column(name = "giftDescription")
    private String giftDescription;

    @Column(name = "imaginePath")
    private String imaginePath;

    @Column(name = "rating")
    private int rating;

    @ManyToOne
    @JoinColumn(name = "occasionId")
    @JsonBackReference
    private Occasion occasion;

    public Gift(String giftDescription, String imaginePath, int rating, Occasion occasion) {
        this.giftDescription = giftDescription;
        this.imaginePath = imaginePath;
        this.rating = rating;
        this.occasion = occasion;
    }
}
