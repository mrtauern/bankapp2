package com.example.demo.model;

import javax.validation.constraints.NotEmpty;

public class SearchCriteria {

    //@NotEmpty(message = "username cant be empty")
    String username;

    public SearchCriteria() {
    }

    public SearchCriteria(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
