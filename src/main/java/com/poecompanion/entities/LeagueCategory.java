package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
public class LeagueCategory {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String apiId;

    @Column
    private boolean isActive;

    public LeagueCategory() {
    }

    public LeagueCategory(long id, String apiId, boolean isActive) {
        this.id = id;
        this.apiId = apiId;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
