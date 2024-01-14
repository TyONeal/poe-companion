package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
public class ItemSocket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int group;

    @Column
    private String attributes;

    @Column
    private String socketColor;

    @Column
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Item items;

    public ItemSocket() {
    }

    public ItemSocket(long id, int group, String attributes, String socketColor) {
        this.id = id;
        this.group = group;
        this.attributes = attributes;
        this.socketColor = socketColor;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getSocketColor() {
        return socketColor;
    }

    public void setSocketColor(String socketColor) {
        this.socketColor = socketColor;
    }
}
