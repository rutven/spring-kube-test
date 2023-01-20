package com.example.demo;

import java.io.Serializable;

public class Greeting implements Serializable {

    private String message;

    public Greeting(String name) {
        this.message = "Hello " + name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
