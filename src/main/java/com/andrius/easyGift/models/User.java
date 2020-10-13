package com.andrius.easyGift.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends  BaseEntity{

    @NotNull
    private String first_name;

    @NotNull
    private String last_name;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('ADMIN','USER')",nullable = false)
    private Role role;

    @NotNull
    private LocalDate birthday;

}
