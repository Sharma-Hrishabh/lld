package org.lld.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    List<Coin> coins;

    Inventory inventory;

    public VendingMachine() {
        coins = new ArrayList<>();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
    public List<Coin> getCoins() {
        return coins;
    }

    public void addCoin(Coin coin) {
        coins.add(coin);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
