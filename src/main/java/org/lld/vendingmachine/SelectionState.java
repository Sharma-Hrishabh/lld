package org.lld.vendingmachine;

import java.util.List;

public class SelectionState implements State {
    @Override
    public void pressInsertCoinButton(VendingMachine vm) {
        throw new RuntimeException("Something went wrong");

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
        ItemShelf itemShelf = vm.getInventory().getItemFromShelf(code);
        if(itemShelf.getSold()) throw new RuntimeException("Item already sold");

        int amountPaid = vm.getCoins().stream().map(Coin::getValue).reduce(0, Integer::sum);

        if(amountPaid< itemShelf.getItem().getPrice()) refundCoin(vm);
        else{
            if(amountPaid>itemShelf.getItem().getPrice()) getChange(vm,amountPaid-itemShelf.getItem().getPrice());
            else{
                vm.setState(new DispenseState(code));
            }
        }
    }

    @Override
    public void dispenseProduct(VendingMachine vm, int code) {
        throw new RuntimeException("Something went wrong");

    }


    @Override
    public void refundCoin(VendingMachine vm) {
        System.out.println("Refund full amount");
        vm.setState(new IdleState());
    }

    @Override
    public void getChange(VendingMachine vm, int amount) {
        System.out.println("Refunding extra amount of"+amount);
    }
}
