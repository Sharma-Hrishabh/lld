package org.lld.vendingmachine;

public class HasMoneyState implements State {
    @Override
    public void pressInsertCoinButton(VendingMachine vm) {
        throw new RuntimeException("Something went wrong");

    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) {
        vm.addCoin(coin);
    }

    @Override
    public void pressSelectProductButton(VendingMachine vm) {
        vm.setState(new SelectionState());
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
        int amount = vm.getCoins().stream().map(Coin::getValue).reduce(0, Integer::sum);
        System.out.println("Refund coin " + amount);
    }

    @Override
    public void getChange(VendingMachine vm, int amount) {
        throw new RuntimeException("Something went wrong");

    }
}
