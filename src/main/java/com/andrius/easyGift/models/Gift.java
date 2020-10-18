package com.andrius.easyGift.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
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
public class Gift{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gifts_id;

    @NotNull
    private String description;

    private String picture;

    private String link;

    public Gift(String description, String picture, String link) {
        this.description = description;
        this.picture = picture;
        this.link = link;
    }

    @ManyToOne
    @JoinColumn(name = "user_gift_id")
    @JsonBackReference
    private UserGift userGift;



}
