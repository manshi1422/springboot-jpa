package com.springboot.JPA.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "usertest")
public class user {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String mobile;

    public long getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public user( String name, String mobile) {

        this.name = name;
        this.mobile = mobile;
    }
    public user() {

    }
    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
