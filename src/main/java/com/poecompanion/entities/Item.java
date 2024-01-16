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

    private final ItemProperty[] itemProperties = new ItemProperty[]{};

    private final ItemProperty[] notableProperties = new ItemProperty[]{};

    private final ItemProperty[] requirements = new ItemProperty[]{};

    private final ItemProperty[] additionalProperties = new ItemProperty[]{};

    private final ItemProperty[] nextLevelRequirements = new ItemProperty[]{};

    private int talismanTier;

    private String typeOfReward;

    private int amountOfReward;

    private String secDescText;

    private final String[] utilityMods = new String[]{};

    private String logbookModsName;

    private String logbookModsFactionId;

    private String getLogbookModsFactionName;
    private final String[] logbookMods = new String[]{};

    private final String[] explicitMods = new String[]{};

    private final String[] craftedMods = new String[]{};

    private final String[] fracturedMods = new String[]{};

    private final String[] crucibleMods = new String[]{};

    private final String[] cosmeticMods = new String[]{};

    private final String[] veiledMods = new String[]{};

    private boolean isVeiled;

    private String descText;

    private final String[] flavorText = new String[]{};

    private final String[] flavorTextParsed = new String[]{};

    private String flavorTextNote;

    private String prophecyText;

    private boolean isRelic;

    private int foilVariation;

    private boolean isReplica;

    private boolean isForeseeing;

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public boolean isVerifiedStatus() {
        return verifiedStatus;
    }

    public void setVerifiedStatus(boolean verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isSupport() {
        return support;
    }

    public void setSupport(boolean support) {
        this.support = support;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    public int getMaxStackSize() {
        return maxStackSize;
    }

    public void setMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
    }

    public String getStackSizeText() {
        return stackSizeText;
    }

    public void setStackSizeText(String stackSizeText) {
        this.stackSizeText = stackSizeText;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public boolean isElder() {
        return isElder;
    }

    public void setElder(boolean elder) {
        isElder = elder;
    }

    public boolean isShaper() {
        return isShaper;
    }

    public void setShaper(boolean shaper) {
        isShaper = shaper;
    }

    public boolean isSearing() {
        return isSearing;
    }

    public void setSearing(boolean searing) {
        isSearing = searing;
    }

    public boolean isTangled() {
        return isTangled;
    }

    public void setTangled(boolean tangled) {
        isTangled = tangled;
    }

    public boolean isAbyssJewel() {
        return isAbyssJewel;
    }

    public void setAbyssJewel(boolean abyssJewel) {
        isAbyssJewel = abyssJewel;
    }

    public boolean isDelve() {
        return isDelve;
    }

    public void setDelve(boolean delve) {
        isDelve = delve;
    }

    public boolean isFractured() {
        return isFractured;
    }

    public void setFractured(boolean fractured) {
        isFractured = fractured;
    }

    public boolean isSynthesised() {
        return isSynthesised;
    }

    public void setSynthesised(boolean synthesised) {
        isSynthesised = synthesised;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeLine() {
        return typeLine;
    }

    public void setTypeLine(String typeLine) {
        this.typeLine = typeLine;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public boolean isIdentified() {
        return identified;
    }

    public void setIdentified(boolean identified) {
        this.identified = identified;
    }

    public int getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getForumNote() {
        return forumNote;
    }

    public void setForumNote(String forumNote) {
        this.forumNote = forumNote;
    }

    public boolean isLockedToCharacter() {
        return isLockedToCharacter;
    }

    public void setLockedToCharacter(boolean lockedToCharacter) {
        isLockedToCharacter = lockedToCharacter;
    }

    public boolean isLockedToAccount() {
        return isLockedToAccount;
    }

    public void setLockedToAccount(boolean lockedToAccount) {
        isLockedToAccount = lockedToAccount;
    }

    public boolean isDuplicated() {
        return isDuplicated;
    }

    public void setDuplicated(boolean duplicated) {
        isDuplicated = duplicated;
    }

    public boolean isSplit() {
        return isSplit;
    }

    public void setSplit(boolean split) {
        isSplit = split;
    }

    public boolean isCorrupted() {
        return isCorrupted;
    }

    public void setCorrupted(boolean corrupted) {
        isCorrupted = corrupted;
    }

    public boolean isUnmodifiable() {
        return isUnmodifiable;
    }

    public void setUnmodifiable(boolean unmodifiable) {
        isUnmodifiable = unmodifiable;
    }

    public boolean isCisRaceAward() {
        return isCisRaceAward;
    }

    public void setCisRaceAward(boolean cisRaceAward) {
        isCisRaceAward = cisRaceAward;
    }

    public boolean isSeaRaceAward() {
        return isSeaRaceAward;
    }

    public void setSeaRaceAward(boolean seaRaceAward) {
        isSeaRaceAward = seaRaceAward;
    }

    public boolean isThRaceAward() {
        return isThRaceAward;
    }

    public void setThRaceAward(boolean thRaceAward) {
        isThRaceAward = thRaceAward;
    }

    public ItemProperty[] getItemProperties() {
        return itemProperties;
    }

    public ItemProperty[] getNotableProperties() {
        return notableProperties;
    }

    public ItemProperty[] getRequirements() {
        return requirements;
    }

    public ItemProperty[] getAdditionalProperties() {
        return additionalProperties;
    }

    public ItemProperty[] getNextLevelRequirements() {
        return nextLevelRequirements;
    }

    public int getTalismanTier() {
        return talismanTier;
    }

    public void setTalismanTier(int talismanTier) {
        this.talismanTier = talismanTier;
    }

    public String getTypeOfReward() {
        return typeOfReward;
    }

    public void setTypeOfReward(String typeOfReward) {
        this.typeOfReward = typeOfReward;
    }

    public int getAmountOfReward() {
        return amountOfReward;
    }

    public void setAmountOfReward(int amountOfReward) {
        this.amountOfReward = amountOfReward;
    }

    public String getSecDescText() {
        return secDescText;
    }

    public void setSecDescText(String secDescText) {
        this.secDescText = secDescText;
    }

    public String[] getUtilityMods() {
        return utilityMods;
    }

    public String getLogbookModsName() {
        return logbookModsName;
    }

    public void setLogbookModsName(String logbookModsName) {
        this.logbookModsName = logbookModsName;
    }

    public String getLogbookModsFactionId() {
        return logbookModsFactionId;
    }

    public void setLogbookModsFactionId(String logbookModsFactionId) {
        this.logbookModsFactionId = logbookModsFactionId;
    }

    public String getGetLogbookModsFactionName() {
        return getLogbookModsFactionName;
    }

    public void setGetLogbookModsFactionName(String getLogbookModsFactionName) {
        this.getLogbookModsFactionName = getLogbookModsFactionName;
    }

    public String[] getLogbookMods() {
        return logbookMods;
    }

    public String[] getExplicitMods() {
        return explicitMods;
    }

    public String[] getCraftedMods() {
        return craftedMods;
    }

    public String[] getFracturedMods() {
        return fracturedMods;
    }

    public String[] getCrucibleMods() {
        return crucibleMods;
    }

    public String[] getCosmeticMods() {
        return cosmeticMods;
    }

    public String[] getVeiledMods() {
        return veiledMods;
    }

    public boolean isVeiled() {
        return isVeiled;
    }

    public void setVeiled(boolean veiled) {
        isVeiled = veiled;
    }

    public String getDescText() {
        return descText;
    }

    public void setDescText(String descText) {
        this.descText = descText;
    }

    public String[] getFlavorText() {
        return flavorText;
    }

    public String[] getFlavorTextParsed() {
        return flavorTextParsed;
    }

    public String getFlavorTextNote() {
        return flavorTextNote;
    }

    public void setFlavorTextNote(String flavorTextNote) {
        this.flavorTextNote = flavorTextNote;
    }

    public String getProphecyText() {
        return prophecyText;
    }

    public void setProphecyText(String prophecyText) {
        this.prophecyText = prophecyText;
    }

    public boolean isRelic() {
        return isRelic;
    }

    public void setRelic(boolean relic) {
        isRelic = relic;
    }

    public int getFoilVariation() {
        return foilVariation;
    }

    public void setFoilVariation(int foilVariation) {
        this.foilVariation = foilVariation;
    }

    public boolean isReplica() {
        return isReplica;
    }

    public void setReplica(boolean replica) {
        isReplica = replica;
    }

    public boolean isForeseeing() {
        return isForeseeing;
    }

    public void setForeseeing(boolean foreseeing) {
        isForeseeing = foreseeing;
    }
}
