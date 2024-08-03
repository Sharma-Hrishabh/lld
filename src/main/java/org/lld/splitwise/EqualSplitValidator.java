package org.lld.splitwise;

import java.util.List;

public class EqualSplitValidator implements SplitValidator{
    @Override
    public void validate(List<Split> splits, double totalAmount) {
        int n = splits.size();
        double expectedAmount = totalAmount/n;
        splits.stream().forEach(split -> {
            if(split.getAmount()!=expectedAmount){throw new RuntimeException("Invalid split for expense");}
        });
    }
}
