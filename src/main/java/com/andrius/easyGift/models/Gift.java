package com.andrius.easyGift.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "gifts")
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

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public String getGiftDescription() {
        return giftDescription;
    }

    public void setGiftDescription(String giftDescription) {
        this.giftDescription = giftDescription;
    }

    public String getImaginePath() {
        return imaginePath;
    }

    public void setImaginePath(String imaginePath) {
        this.imaginePath = imaginePath;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public Gift(Long giftId, String giftDescription, String imaginePath, int rating, Occasion occasion) {
        this.giftId = giftId;
        this.giftDescription = giftDescription;
        this.imaginePath = imaginePath;
        this.rating = rating;
        this.occasion = occasion;
    }

    public Gift() {
    }
}
