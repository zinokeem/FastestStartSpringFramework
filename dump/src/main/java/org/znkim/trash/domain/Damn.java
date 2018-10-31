package org.znkim.trash.domain;

import java.util.Date;

public class Damn {
    private int id;
    private String name;
    private String nickname;
    private Date joinDate;
    private Date lastestDate;
    private String auth;

    private String text;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Date getLastestDate() {
        return lastestDate;
    }
    public void setLastestDate(Date lastestDate) {
        this.lastestDate = lastestDate;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAuth() {
        return auth;
    }
    public void setAuth(String auth) {
        this.auth = auth;
    }
}
