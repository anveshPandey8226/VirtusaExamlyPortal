package service;

interface InterfaceClass {
	abstract double withdrawAmount(double withdrawAmount, double balance);
    abstract double depositAmount(double depositAmount, double balance);
    abstract double accountBalance(double balance);
}
