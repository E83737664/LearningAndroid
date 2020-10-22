package com.example.testtab.dao;

import java.util.Date;

public class Item {
    private Integer id;
    private String name;
    private String message;
    public Item() {
        this.name = "";
        this.message = "";
    }
    public Item(Integer id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getMessage() {
        return message;
    }

}
