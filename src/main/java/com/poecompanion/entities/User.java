package com.poecompanion.entities;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "accounts")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50, unique = true)
    private String username;

    @Column(nullable = false, length = 60, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String realm;

    @Column
    private String twitchHandle;

    @Column
    private String twitchStreamName;

    @Column
    private String twitchStreamImage;

    @Column
    private String twitchStreamStatus;

    @Column
    @ManyToOne
    private Guild guild;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user")
    private List<Character> characters;

    public User() {

    }

    public User(long id, String username, String email, String password, List<Character> characters) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.characters = characters;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
