package abstraction_ExceptionHandling;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


abstract class Account{
    
    String name;
    int number;
    int balance;
    Date startDate;
    
    abstract double calculateInterest(double amt, int T);
    public int getDueDate(Date startDate, Date endDate){
        Calendar c1 = new GregorianCalendar();
        c1.setTime(startDate);
        
        Calendar c2 = new GregorianCalendar();
        c2.setTime(endDate);
        
        int diff = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
        return diff;
    }
}

class CurrentAccount extends Account{
    
	@Override
	double calculateInterest(double amt, int T) {
		double SI = (amt * 5.0 * T)/100.0;
		System.out.println(SI);
		return 0;
	}
    
}

class SavingsAccount extends Account{
    
	@Override
	double calculateInterest(double amt, int T) {
		double SI = (amt * 12.0 * T)/100.0;
		System.out.println(SI);
		return 0;
	}
}



public class Bank{
	public static void main(String[] args) throws ParseException{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String name = s.next();
        String acc = s.next();
        double amt = s.nextDouble();
        String sd = s.next();
        Date sdate =new SimpleDateFormat("dd/MM/yyyy").parse(sd);  
        String ed = s.next();
        Date edate =new SimpleDateFormat("dd/MM/yyyy").parse(ed);  
        
        if(n == 2) {
        	CurrentAccount c = new CurrentAccount();
        	int t = c.getDueDate(sdate, edate);
        	c.calculateInterest(amt, t);
        	
        }
        else {
        	SavingsAccount sa = new SavingsAccount();
        	int t = sa.getDueDate(sdate, edate);
        	sa.calculateInterest(amt, t);
        }
        
        
    }
}