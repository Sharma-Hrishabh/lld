package org.lld.splitwise;

public class Balance {
    private double youOwe;
    private double youGetBack;

    public Balance(double youOwe, double youGetBack) {
        this.youOwe = youOwe;
        this.youGetBack = youGetBack;
    }

    public Balance(){}

    public double getYouOwe() {
        return youOwe;
    }

    public void setYouOwe(double youOwe) {
        this.youOwe = youOwe;
    }

    public double getYouGetBack() {
        return youGetBack;
    }

    public void setYouGetBack(double youGetBack) {
        this.youGetBack = youGetBack;
    }
}
