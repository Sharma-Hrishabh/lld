package org.lld.splitwise;

import java.util.List;

public class UnequalSplitValidator implements SplitValidator {

    @Override
    public void validate(List<Split> splits, double totalAmount) {
        double sum = splits.stream().mapToDouble(Split::getAmount).sum();
        if(sum != totalAmount) {throw new RuntimeException("Invalid split for expense");}
    }
}
