package com.poecompanion.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "passive_nodes")
public class PassiveNode {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int skill;

    private String name;

    private String icon;

    private boolean isKeystone;

    private boolean isNotable;

    private boolean isMastery;

    private String inactiveIcon;

    private String activeIcon;

    private String activeEffectImage;

    private int masterEffect;

    private final String[] masteryEffectsStats = new String[]{};

    private final String[] masteryEffectsReminderText = new String[]{};

    private boolean isBlighted;

    private boolean isTattoo;

    private boolean isProxy;

    private boolean isJewelSocket;



}
