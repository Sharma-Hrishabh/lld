package org.lld.splitwise;

import java.util.List;

public class ExpenseController {

    public ExpenseController() {
    }

    public void createExpense(int id, double amount, String description, User paidBy, List<Split> splits,SplitType splitType) {
        //validate expense
        SplitValidator splitValidator=  SplitValidatorFactory.createSplitValidator(splitType);
        splitValidator.validate(splits,amount);
        Expense expense = new Expense(id,amount,description,paidBy,splitType);

        //update user balance sheet

    }
}
