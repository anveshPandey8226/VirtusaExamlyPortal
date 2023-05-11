package service;

public class AmountDetails implements InterfaceClass {

    public double withdrawAmount(double withdrawAmount, double balance) {
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
        }

        return balance;
    }

    public double depositAmount(double depositAmount, double balance) {
        balance = balance + depositAmount;
        return balance;
    }

    public double accountBalance(double balance) {
        return balance;
    }
    
	
}
