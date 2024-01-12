package com.poecompanion.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StashTab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String apiId;

    @Column
    private String parent;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column
    private Boolean isPublic;

    @Column
    private Boolean isInFolder;

    @Column
    private String tabColor;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "stash")
    private List<Item> itemList;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "character_id")
    private Character character;


}
