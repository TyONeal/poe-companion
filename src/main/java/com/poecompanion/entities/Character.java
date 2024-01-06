package com.poecompanion.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false, length = 60, unique = true)
    private String characterName;

    @Column(nullable = false, length = 3)
    private long level;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "character")
    private List<Stash> stashList;
}
