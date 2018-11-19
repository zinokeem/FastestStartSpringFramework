package org.znkim.domain;

import java.util.Date;

public class First {
    private int id;
    private String name;
    private String nickname;
    private Date joinDate;
    private Date lastestDate;
    private String auth;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getNickname() {
        return nickname;
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public Date getLastestDate() {
        return lastestDate;
    }
    public String getAuth() {
        return auth;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    public void setLastestDate(Date lastestDate) {
        this.lastestDate = lastestDate;
    }
    public void setAuth(String auth) {
        this.auth = auth;
    }


}
