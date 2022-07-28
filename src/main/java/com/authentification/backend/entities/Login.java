package com.authentification.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_login", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 250)
    private String username;

    @Column(name = "password_login", length = 250)
    private String password;

    @Column(name = "first_name", length = 250)
    private String firstName;

    @Column(name = "family_name", length = 250)
    private String familyName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordLogin() {
        return password;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.password = passwordLogin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}