package com.poecompanion.entities;

import jakarta.persistence.*;

public abstract class Item implements Definable {

    private long id;

    private String name;

    private String description;

    private int size;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "stash_id")
    private StashTab stashTab;


}
