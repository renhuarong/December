package com.example.decemberdomain.request;

import lombok.Data;


public class GreetingRequest {
    Integer id;

    public GreetingRequest(){}
    public GreetingRequest(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
