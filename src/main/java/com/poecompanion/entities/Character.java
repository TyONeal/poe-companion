package com.poecompanion.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String apiId;

    @Column
    private String name;

    @Column
    private String realm;

    @Column
    private String characterClass;

    @Column
    private String league;

    @Column
    private int level;

    @Column
    private int experience;

    @Column
    private boolean isRuthless;

    @Column
    private boolean isExpired;

    @Column
    private boolean isDeleted;

    @Column
    private boolean isCurrent;

    @Column
    private boolean
}
