package com.poecompanion.entities;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "league")
    private List<LeagueRules> leagueRulesList;

    @Column
    private String registerAt;

    @Column
    private boolean isEvent;

    @Column
    private String url;

    @Column
    private String startAt;

    @Column
    private String endAt;

    @Column
    private boolean isTimedEvent;

    @Column
    private boolean isScoredEvent;

    @Column
    private boolean isDelveEvent;

    @Column
    private boolean isAncestorEvent;

    @Column
    private boolean isLeagueEvent;

    public League() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public List<LeagueRules> getLeagueRulesList() {
        return leagueRulesList;
    }

    public void setLeagueRulesList(List<LeagueRules> leagueRulesList) {
        this.leagueRulesList = leagueRulesList;
    }

    public String getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(String registerAt) {
        this.registerAt = registerAt;
    }

    public boolean isEvent() {
        return isEvent;
    }

    public void setEvent(boolean event) {
        isEvent = event;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public boolean isTimedEvent() {
        return isTimedEvent;
    }

    public void setTimedEvent(boolean timedEvent) {
        isTimedEvent = timedEvent;
    }

    public boolean isScoredEvent() {
        return isScoredEvent;
    }

    public void setScoredEvent(boolean scoredEvent) {
        isScoredEvent = scoredEvent;
    }

    public boolean isDelveEvent() {
        return isDelveEvent;
    }

    public void setDelveEvent(boolean delveEvent) {
        isDelveEvent = delveEvent;
    }

    public boolean isAncestorEvent() {
        return isAncestorEvent;
    }

    public void setAncestorEvent(boolean ancestorEvent) {
        isAncestorEvent = ancestorEvent;
    }

    public boolean isLeagueEvent() {
        return isLeagueEvent;
    }

    public void setLeagueEvent(boolean leagueEvent) {
        isLeagueEvent = leagueEvent;
    }
}
