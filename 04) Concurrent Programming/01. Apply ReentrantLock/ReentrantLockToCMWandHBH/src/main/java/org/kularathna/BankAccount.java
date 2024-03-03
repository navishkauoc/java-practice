package org.kularathna;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNo;

    private final ReentrantLock lock = new ReentrantLock();

    public BankAccount(double balance, String accountNo) {
        super();
        this.balance = balance;
        this.accountNo = accountNo;
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (amount > 0 && balance >= amount) {
                this.balance -= amount;
                System.out.println("Withrawal Successful!!!");
                System.out.println(Thread.currentThread().getName()+
                        " the balance after withraw is "+
                        this.getBalance());
            } else {
                throw new IllegalArgumentException("Insufficient funds or Invalid Amount");
            }
        }finally {
            lock.unlock();
        }

    }

    public void deposit(double amount) {
        lock.lock();
        try {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Desposit Successful!!!");
                System.out.println(Thread.currentThread().getName()+
                        " the balance after deposit is "+
                        this.getBalance());
            } else {
                throw new IllegalArgumentException("Invalid Amount. Amount cannot be ZERO or lesser");
            }
        } finally {
            lock.unlock();
        }
    }
}
