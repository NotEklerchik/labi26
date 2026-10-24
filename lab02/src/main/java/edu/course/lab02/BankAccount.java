package edu.course.lab02;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");

        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        if (amount > balance) throw new IllegalArgumentException("Amount cannot be greater than balance");

        this.balance -= amount;
    }

//    GETTERS

    public int getBalance() {
        return balance;
    }
}
