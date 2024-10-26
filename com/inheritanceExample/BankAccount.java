package com.inheritanceExample;

public class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Not engouh balance.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(200);

        s.deposit(100);         
        s.withdraw(550);        
        s.withdraw(100);         
    }
    
}

	class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Sorry. Minimum balance of $100 must be maintained.");
        } else {
            super.withdraw(amount);  
        }
    }

    
}

