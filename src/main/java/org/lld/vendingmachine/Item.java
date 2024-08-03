package org.lld.vendingmachine;

public class Item {
    private Type type;
    private int price;
    public Item(Type type, int price) {
        this.type = type;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}