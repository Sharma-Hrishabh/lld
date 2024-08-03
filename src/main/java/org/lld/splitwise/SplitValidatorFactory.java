package org.lld.splitwise;

public class SplitValidatorFactory {
    public static SplitValidator createSplitValidator(SplitType splitType) {
        switch (splitType) {
            case EQUAL -> {
                return new EqualSplitValidator();
            }
            case UNEQUAL -> {
                return new UnequalSplitValidator();
            }
            case PERCENTAGE -> {
                return new PercentageSplitValidator();
            }
            default -> {
                return new EqualSplitValidator();
            }
        }
    }
}
