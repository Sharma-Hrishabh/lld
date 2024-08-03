package org.lld.vendingmachine;

public interface State {
    public void pressInsertCoinButton(VendingMachine vm);
    public void insertCoin(VendingMachine vm,Coin coin);
    public void pressSelectProductButton(VendingMachine vm);
    public void chooseProduct(VendingMachine vm, int code);
    public void dispenseProduct(VendingMachine vm, int code);
    public void refundCoin(VendingMachine vm);
    public void getChange(VendingMachine vm, int amount);
}
