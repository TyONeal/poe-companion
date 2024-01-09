package com.poecompanion.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Weapon extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String handedness;

    @Column(nullable = false)
    private int stashSize;

    public Weapon() {

    }

    public Weapon(String name, String type, String handedness, int stashSize) {
        this.name = name;
        this.type = type;
        this.handedness = handedness;
        this.stashSize = stashSize;
    }

    public Weapon(long id, String name, String type, String handedness, int stashSize) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.handedness = handedness;
        this.stashSize = stashSize;
    }
}
