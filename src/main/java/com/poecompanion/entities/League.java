package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "leagues")
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String leagueName;

    @Column
    private String realm;

    @Column
    private String categoryId;

    @Column
    private boolean categoryStatus;


}
