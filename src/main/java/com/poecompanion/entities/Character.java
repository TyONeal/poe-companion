package com.poecompanion.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 60, unique = true)
    private String characterName;

    @Column(nullable = false, length = 3)
    private long level;

    @Column(nullable = false, length = 15)
    private String classType;

    @Column(nullable = false, length = 3)
    private long skillPoints;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "character")
    private List<StashTab> stashList;

    public Character() {
    }

    public Character(long id, User user, String characterName, long level, String classType, long skillPoints, List<StashTab> stashList) {
        this.id = id;
        this.user = user;
        this.characterName = characterName;
        this.level = level;
        this.classType = classType;
        this.skillPoints = skillPoints;
        this.stashList = stashList;
    }

    public Character(User user, String characterName, long level, String classType, long skillPoints, List<StashTab> stashList) {
        this.user = user;
        this.characterName = characterName;
        this.level = level;
        this.classType = classType;
        this.skillPoints = skillPoints;
        this.stashList = stashList;
    }

    public Character(String characterName) {
        this.characterName = characterName;
    }

    public Character(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public long getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(long skillPoints) {
        this.skillPoints = skillPoints;
    }

    public List<StashTab> getStashList() {
        return stashList;
    }

    public void setStashList(List<StashTab> stashList) {
        this.stashList = stashList;
    }
}
