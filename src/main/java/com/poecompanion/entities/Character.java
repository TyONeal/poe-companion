package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
public class Character {

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false, length = 60, unique = true)
    private String characterName;

    @Column(nullable = false, length = 3)
    private long level;
}
