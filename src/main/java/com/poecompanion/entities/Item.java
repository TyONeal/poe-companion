package com.poecompanion.entities;

import jakarta.persistence.*;

import java.util.ArrayList;

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String apiId;

    private boolean verifiedStatus;

    private String icon;

    private boolean support;

    private int stackSize;

    private int maxStackSize;

    private String stackSizeText;

    private String league;

    private boolean isElder;

    private boolean isShaper;

    private boolean isSearing;

    private boolean isTangled;

    private boolean isAbyssJewel;

    private boolean isDelve;

    private boolean isFractured;

    private boolean isSynthesised;

    private String name;

    private String typeLine;

    private String baseType;

    private String rarity;

    private boolean identified;

    private int itemLevel;

    private String note;

    private String forumNote;

    private boolean isLockedToCharacter;

    private boolean isLockedToAccount;

    private boolean isDuplicated;

    private boolean isSplit;

    private boolean isCorrupted;

    private boolean isUnmodifiable;

    private boolean isCisRaceAward;

    private boolean isSeaRaceAward;

    private boolean isThRaceAward;

}
