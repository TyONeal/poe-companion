package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
public class LeagueRules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String identifier;

    @Column
    private String name;

    @Column
    private String description;

    public LeagueRules() {
    }

    public LeagueRules(long id, String identifier, String name, String description) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
