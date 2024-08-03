package org.lld.splitwise;

public class Split {
    private User user;
    private double amount;
    private double percentage;

    public Split(User user, double amount, double percentage) {
        this.user = user;
        this.amount = amount;
        this.percentage = percentage;
    }

    public Split(){

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
