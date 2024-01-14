package com.poecompanion.entities;

import jakarta.persistence.*;
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String apiId;

    @Column
    private boolean verifiedStatus;

    @Column
    private String icon;

    @Column
    private boolean support;

    @Column
    private int stackSize;

    @Column
    private int maxStackSize;

    @Column
    private String stackSizeText;

    @Column
    private String league;

    @Column
    private boolean isElder;

    @Column
    private boolean isShaper;

    @Column
    private boolean isSearing;

    @Column
    private boolean isTangled;

    @Column
    private boolean isAbyssJewel;

    @Column
    private boolean isDelve;

    @Column
    private boolean isFractured;

    @Column
    private boolean isSynthesised;

    @Column
    @ManyToMany
    @JoinTable(name = "item_itemSockets")
    private ItemSocket itemSockets;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "stash_id")
    private StashTab stashTab;


}
