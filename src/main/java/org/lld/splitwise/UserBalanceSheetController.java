package org.lld.splitwise;

import java.util.List;

public class UserBalanceSheetController {
    public void updateBalanceSheet(User paidBy, List<Split> splits, double totalAmount) {
        UserBalanceSheet userPaidBalanceSheet = paidBy.getUserBalanceSheet();
        userPaidBalanceSheet.setTotalPayment(totalAmount+userPaidBalanceSheet.getTotalPayment());

        for (Split split : splits) {
            //getbacks from users
            User userOwe = split.getUser();
            UserBalanceSheet userBalanceSheetOwe = userOwe.getUserBalanceSheet();
            double oweAmount = split.getAmount();

            if(paidBy.equals(userOwe)){
                userPaidBalanceSheet.setTotalUserExpense(userBalanceSheetOwe.getTotalUserExpense()+oweAmount);
            }
            else{

                //update the balance of paid user
                userPaidBalanceSheet.setTotalGetBack(userPaidBalanceSheet.getTotalGetBack() + oweAmount);

                Balance userOweBalance;
                if(userPaidBalanceSheet.getUserBalanceMap().containsKey(userOwe)) {
                    userOweBalance = userPaidBalanceSheet.getUserBalanceMap().get(userOwe);
                }
                else {
                    userOweBalance = new Balance();
                    userPaidBalanceSheet.getUserBalanceMap().put(userOwe, userOweBalance);
                }

                userOweBalance.setYouGetBack(userOweBalance.getYouGetBack() + oweAmount);


                //update the balance sheet of owe user
                userBalanceSheetOwe.setTotalOwe(userBalanceSheetOwe.getTotalOwe() + oweAmount);
                userBalanceSheetOwe.setTotalUserExpense(userBalanceSheetOwe.getTotalUserExpense() + oweAmount);

                Balance userPaidBalance;
                if(userBalanceSheetOwe.getUserBalanceMap().containsKey(paidBy)){
                    userPaidBalance = userBalanceSheetOwe.getUserBalanceMap().get(paidBy);
                }
                else{
                    userPaidBalance = new Balance();
                    userBalanceSheetOwe.getUserBalanceMap().put(paidBy, userPaidBalance);
                }
                userPaidBalance.setYouOwe(userPaidBalance.getYouOwe() + oweAmount);

            }





        }

    }
}
