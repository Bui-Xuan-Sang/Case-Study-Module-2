package com.company.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private long price;
    private String description;

    public Product() {
    }

    public Product(String id, String name, long price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String string = String.format("%-10s  %-20s %10d       %s", id, name, price, description);
        return string;
    }
}
