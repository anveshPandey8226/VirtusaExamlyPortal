package model;

public class AccountDetails{

    private String accountType;
    private double withdrawOrDepositAmount;
    private double availableBalance;
    private int pin;

    public String getAccountType(){
        return this.accountType;
    }

    public double getWithdrawOrDepositAmount(){
        return this.withdrawOrDepositAmount;
    }

    public double getAvailableBalance(){
        return this.availableBalance;
    }

    public int getPin(){
        return this.pin;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public void setWithdrawOrDepositAmount(double withdrawOrDepositAmount){
        this.withdrawOrDepositAmount = withdrawOrDepositAmount;
    }

    public void setAvailableBalance(double availableBalance){
        this.availableBalance = availableBalance;

    }

    public void setPin(int pin){
        this.pin = pin;
    }

    public AccountDetails(String accountType,double withdrawOrDepositAmount,double availableBalance,int pin){
        setAccountType(accountType);
        setWithdrawOrDepositAmount(withdrawOrDepositAmount);
        setAvailableBalance(availableBalance);
        setPin(pin);
    }
	
}
