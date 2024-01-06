package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
public class Stash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "character_id")
    private Character character;
}
