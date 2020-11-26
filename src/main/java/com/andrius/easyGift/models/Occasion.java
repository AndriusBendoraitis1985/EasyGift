package com.andrius.easyGift.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "occasions")
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Occasion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "occasionId")
    private Long occasionId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userSurname")
    private String userSurname;

    @Column(name = "occasionType")
    private String occasionType;

    @Column(name = "occasionDate")
    private LocalDate occasionDate;

    @OneToMany (mappedBy = "occasion", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Gift> gifts = new ArrayList<>();

    public Occasion(String userName, String userSurname, String occasionType, LocalDate occasionDate) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.occasionType = occasionType;
        this.occasionDate = occasionDate;
    }
}
