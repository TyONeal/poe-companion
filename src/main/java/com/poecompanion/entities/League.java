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

    public League() {
    }

    public League(long id, String leagueName, String realm, String categoryId, boolean categoryStatus, List<LeagueRules> leagueRulesList) {
        this.id = id;
        this.leagueName = leagueName;
        this.realm = realm;
        this.categoryId = categoryId;
        this.categoryStatus = categoryStatus;
        this.leagueRulesList = leagueRulesList;
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
}
