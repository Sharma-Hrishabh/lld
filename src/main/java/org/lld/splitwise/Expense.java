package org.lld.splitwise;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    private int id;
    private double amount;
    private String description;
    private User paidBy;
    private SplitType splitType;
    private List<Split> splits;

    public Expense(int id,double amount,String description, User paidBy,SplitType splitType){
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.paidBy=paidBy;
        this.splitType=splitType;
        this.splits=new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }
}
