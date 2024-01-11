package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
public class Gems extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;


}
