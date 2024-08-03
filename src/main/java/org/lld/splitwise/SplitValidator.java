package org.lld.splitwise;

import java.util.List;

public interface SplitValidator {
    public void validate(List<Split> splits, double totalAmount);
}
