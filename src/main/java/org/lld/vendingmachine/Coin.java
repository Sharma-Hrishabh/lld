package org.lld.vendingmachine;

public enum Coin {
    RUPEE(1),
    FIVERUPEE(5),
    TENRUPEE(10);

    public int value;
    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
