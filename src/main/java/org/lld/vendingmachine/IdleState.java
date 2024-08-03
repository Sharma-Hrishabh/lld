package org.lld.vendingmachine;

public class IdleState implements State {
    @Override
    public void pressInsertCoinButton(VendingMachine vm) {
        vm.setState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) {
    throw new RuntimeException("Something went wrong");
    }

    @Override
    public void pressSelectProductButton(VendingMachine vm) {
        throw new RuntimeException("Something went wrong");

    }

    @Override
    public void chooseProduct(VendingMachine vm, int code) {
        throw new RuntimeException("Something went wrong");

    }

    @Override
    public void dispenseProduct(VendingMachine vm, int code) {
        throw new RuntimeException("Something went wrong");

    }

    @Override
    public void refundCoin(VendingMachine vm) {

    }

    @Override
    public void getChange(VendingMachine vm, int amount) {
        throw new RuntimeException("Something went wrong");

    }
}
