package com.poecompanion.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public abstract class Item implements Definable{

    private long id;

    private String name;

    private String description;

    private int size;



}
