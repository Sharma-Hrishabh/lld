package org.lld.splitwise;

import java.util.List;

public class Group {
    private int id;
    private String name;
    private List<User> users;
    private List<Expense> expenses;
    private ExpenseController expenseController;
    public Group(int id, String name, List<User> users, List<Expense> expenses,ExpenseController expenseController) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.expenses = expenses;
        this.expenseController = expenseController;
    }

    public Group(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public ExpenseController getExpenseController() {
        return expenseController;
    }

    public void setExpenseController(ExpenseController expenseController) {
        this.expenseController = expenseController;
    }
}
