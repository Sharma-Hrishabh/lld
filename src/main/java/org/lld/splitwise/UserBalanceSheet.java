package org.lld.splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserBalanceSheet {
    Map<User,Balance> userBalanceMap;

    private double totalUserExpense;
    private double totalPayment;
    private double totalOwe;
    private double totalGetBack;


    public UserBalanceSheet() {
        userBalanceMap = new HashMap<>();
    }

    public Map<User, Balance> getUserBalanceMap() {
        return userBalanceMap;
    }

    public void setUserBalanceMap(Map<User, Balance> userBalanceMap) {
        this.userBalanceMap = userBalanceMap;
    }

    public double getTotalUserExpense() {
        return totalUserExpense;
    }

    public void setTotalUserExpense(double totalExpense) {
        this.totalUserExpense = totalExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalOwe() {
        return totalOwe;
    }

    public void setTotalOwe(double totalOwe) {
        this.totalOwe = totalOwe;
    }

    public double getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(double totalGetBack) {
        this.totalGetBack = totalGetBack;
    }
}
