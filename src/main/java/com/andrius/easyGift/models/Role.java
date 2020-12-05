package com.andrius.easyGift.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "roleId")
    private Long roleId;

    @Column (name = "name")
    private String name;



}
