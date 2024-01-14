package com.poecompanion.entities;

import jakarta.persistence.*;
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String description;

    private int size;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "stash_id")
    private StashTab stashTab;


}
