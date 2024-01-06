package com.poecompanion.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Stash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "character_id")
    private Character character;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "stash")
    private List<Item> itemList;

    public Stash() {
    }

    public Stash(long id, String name, Character character, List<Item> itemList) {
        this.id = id;
        this.name = name;
        this.character = character;
        this.itemList = itemList;
    }

    public Stash(Character character, List<Item> itemList) {
        this.character = character;
        this.itemList = itemList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
