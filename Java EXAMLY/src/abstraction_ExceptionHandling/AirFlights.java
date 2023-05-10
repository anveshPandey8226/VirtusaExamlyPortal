package abstraction_ExceptionHandling;

import java.util.Scanner;

interface Airfare{
	double calculateAmount();
}

class AirIndia implements Airfare{
	
	
	private int hours;
	private double costPerHour;
	
	AirIndia(int hours, double costPerHour){
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
		
	}

	@Override
	public double calculateAmount() {
		double ans;
		ans = hours * costPerHour;
		System.out.println(ans);
		return ans;
	}
	
}

class KingFisher implements Airfare{
	
	
	private int hours;
	private double costPerHour;
	
	KingFisher(int hours, double costPerHour){
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
		
	}

	@Override
	public double calculateAmount() {
		double ans;
		ans = hours * costPerHour *4.0;
		System.out.println(ans);
		return ans;
	}
	
}

class Indigo implements Airfare{
	
	
	private int hours;
	private double costPerHour;

	Indigo(int hours, double costPerHour){
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	
	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
		
	}

	@Override
	public double calculateAmount() {
		double ans;
		ans = hours * costPerHour *8.0;
		System.out.println(ans);
		return ans;
	}
	
}



public class AirFlights {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		int hours = s.nextInt();
		double costPerHour = s.nextDouble();
		
		if(choice == 1) {
			AirIndia f = new AirIndia(hours,costPerHour);
			f.calculateAmount();
		}
		else if(choice == 2){
			KingFisher f = new KingFisher(hours,costPerHour);
			f.calculateAmount();
		}
		else {
			Indigo f = new Indigo(hours,costPerHour);
			f.calculateAmount();
		}
	}
	
}
