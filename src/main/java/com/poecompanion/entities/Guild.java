package com.poecompanion.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Guild {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String apiId;

    @Column(nullable = false)
    private String name;

    @Column
    private String tag;

    @Column
    private int points;

    @Column
    private String statusMessage;

    @Column(nullable = false)
    private String createdAt;

    @Column(nullable = false)
    @OneToMany
    private List<User> memberList;

    public Guild() {
    }

    public Guild(long id) {
        this.id = id;
    }

    public Guild(String name) {
        this.name = name;
    }

    public Guild(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Guild(long id, String apiId, String name, String tag, int points, String statusMessage, String createdAt) {
        this.id = id;
        this.apiId = apiId;
        this.name = name;
        this.tag = tag;
        this.points = points;
        this.statusMessage = statusMessage;
        this.createdAt = createdAt;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
