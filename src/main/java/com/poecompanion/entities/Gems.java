package com.poecompanion.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Gems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


}
