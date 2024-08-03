package org.lld.vendingmachine;

public class DispenseState implements State {
    int code;

    public DispenseState(int code) {
        this.code = code;
    }

    @Override
    public void pressInsertCoinButton(VendingMachine vm) {
        System.out.println("Something went wrong");
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) {
        System.out.println("Something went wrong");

    }

    @Override
    public void pressSelectProductButton(VendingMachine vm) {
        System.out.println("Something went wrong");

    }

    @Override
    public void chooseProduct(VendingMachine vm, int code) {
        System.out.println("Something went wrong");

    }

    @Override
    public void dispenseProduct(VendingMachine vm, int code) {

        System.out.println("Dispensing product" + code);
        vm.setState(new IdleState());
    }


    @Override
    public void refundCoin(VendingMachine vm) {
        System.out.println("Something went wrong");

    }

    @Override
    public void getChange(VendingMachine vm, int amount) {
        System.out.println("Something went wrong");

    }
}
