package com.designerpatterns.app;

import jakarta.persistence.*;

@Entity
@Table(name="UserEntityV3")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer UserEntityId;

    @Column(nullable = false)
    private String fullName;

    @Column(name="username", nullable = false)
    private String username;

    @Column(name="passwd", nullable = false)
    private String passwd;

    @Column(name="role", nullable = false)
    private String role;

    @Column(nullable = false, columnDefinition="boolean default true")
    private Boolean active;

    public Integer getUserEntityId() {
        return UserEntityId;
    }

    public void setUserEntityId(Integer userEntityId) {
        UserEntityId = userEntityId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
