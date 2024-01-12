package com.poecompanion.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ItemFilter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
