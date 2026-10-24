package edu.course.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    static BankAccount bankAccount = new BankAccount(1000);

    @Test
    void depositingValidValue() {
        int expectedBalance = bankAccount.getBalance() + 500;
        bankAccount.deposit(500);

        assertEquals(expectedBalance, bankAccount.getBalance());
    }

    @Test
    void depositingNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-500));
    }

    @Test
    void withdrawalValidValue() {
        int expectedBalance = bankAccount.getBalance() - 500;
        bankAccount.withdraw(500);

        assertEquals(expectedBalance, bankAccount.getBalance());
    }

    @Test
    void withdrawalNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-500));
    }

    @Test
    void withdrawalMoreThanBalanceValue() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(bankAccount.getBalance() + 500));
    }
}