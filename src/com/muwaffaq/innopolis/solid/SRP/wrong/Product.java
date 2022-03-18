package com.muwaffaq.innopolis.solid.SRP.wrong;

public class Product {
    int id;
    int value;

    public Product(int id, int value ){
        this.id = id;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getId() {
        return id;
    }
}
