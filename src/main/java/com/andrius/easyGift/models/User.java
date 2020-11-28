package com.andrius.easyGift.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "logoPath")
    private String logoPath;

    @Column(name = "role")
    private String role;

    public User(String userName, String password, String email, String logoPath, String role) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.logoPath = logoPath;
        this.role = role;
    }
}
