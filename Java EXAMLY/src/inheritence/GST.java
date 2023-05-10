package inheritence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Event{
	String name;
	String detail;
	String type;
	String ownerName;
	double costPerDay;
	
	public int getDueDate(Date startDate, Date endDate){
        Calendar c1 = new GregorianCalendar();
        c1.setTime(startDate);
        
        Calendar c2 = new GregorianCalendar();
        c2.setTime(endDate);
        
        int diff = c2.get(Calendar.DATE) - c1.get(Calendar.DATE);
        return diff;
    }
}


class Exhibition extends Event{
	int noOfStall;
	
	Exhibition(double costPerDay){
		this.costPerDay = costPerDay;
	}
	
	void calculateGST(int numDays) {
		double GST = (numDays * costPerDay * 5.0)/100.0;
		System.out.println(GST);
	}
}

class StageEvent extends Event{
	int noOfSeats;
	
	StageEvent(double costPerDay){
		this.costPerDay = costPerDay;
	}
	
	void calculateGST(int numDays) {
		double GST = (numDays * costPerDay * 15.0)/100.0;
		System.out.println(GST);
}

}

public class GST {
	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		String name = s.next();
		String detail = s.next();
		String type = s.next();
		String Ownername = s.next();
		double costPerDay = s.nextDouble();
		int nouse = s.nextInt();
		
		String sd = s.next();
        Date sdate =new SimpleDateFormat("dd/MM/yyyy").parse(sd);  
        String ed = s.next();
        Date edate =new SimpleDateFormat("dd/MM/yyyy").parse(ed); 
       
        
        if(choice == 1) {
        	Exhibition e = new Exhibition(costPerDay);
        	int t = e.getDueDate(sdate, edate);
        	e.calculateGST(t);
        }
        else {
        	StageEvent se = new StageEvent(costPerDay);
        	int t = se.getDueDate(sdate, edate);
        	se.calculateGST(t);
        }
	}

}
