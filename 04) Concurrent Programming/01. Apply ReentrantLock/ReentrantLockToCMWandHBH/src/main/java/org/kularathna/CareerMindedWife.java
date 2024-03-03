package org.kularathna;

public class CareerMindedWife extends Thread {

    private BankAccount bankAccount;

    public CareerMindedWife(BankAccount bankAccount, String name) {
        super(name);
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() { // the body of the CMW thread
        for (int i = 1; i <= 10; i++) {
            bankAccount.deposit(10000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
