package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "item_properties")
public class ItemProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String valueOne;

    @Column
    private int valueTwo;

    @Column
    private int displayMode;

    @Column
    private double progress;

    @Column
    private int type;

    @Column
    private String suffix;

    public ItemProperty() {
    }

    public ItemProperty(long id, String name, String valueOne, int valueTwo, int displayMode, double progress, int type, String suffix) {
        this.id = id;
        this.name = name;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.displayMode = displayMode;
        this.progress = progress;
        this.type = type;
        this.suffix = suffix;
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

    public String getValueOne() {
        return valueOne;
    }

    public void setValueOne(String valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public int getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(int displayMode) {
        this.displayMode = displayMode;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
