package com.company.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private long price;
    private int amount;
    private String description;

    public Product() {
    }

    public Product(String id, String name, long price, int amount,String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
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
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String string = String.format("%-10s  %-20s %10d       %s      %s", id, name, price,amount,description);
        return string;
    }
}
