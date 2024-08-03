package org.lld.vendingmachine;

public class ItemShelf {
    Item item;
    int code;
    Boolean isSold;

    public void ItemShelf(Item item, int code, Boolean isSold) {
        this.item = item;
        this.code = code;
        this.isSold = isSold;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Boolean getSold() {
        return isSold;
    }

    public void setSold(Boolean sold) {
        isSold = sold;
    }
}
