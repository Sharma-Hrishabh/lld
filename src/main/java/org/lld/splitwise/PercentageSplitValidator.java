package org.lld.splitwise;

import java.util.List;

public class PercentageSplitValidator implements SplitValidator{
    @Override
    public void validate(List<Split> splits, double totalAmount) {
        double per = splits.stream().mapToDouble(Split::getPercentage).sum();
        if(per!=100) throw new RuntimeException("Invalid split for expense");
    }
}
