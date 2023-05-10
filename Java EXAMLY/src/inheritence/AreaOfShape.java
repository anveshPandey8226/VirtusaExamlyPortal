package inheritence;

import java.util.Scanner;

class Shape{
	protected double area;
	
	public void computeArea() {
		area = 0;
	}
}

class Circle extends Shape{
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public void computeArea() {
		double area = 3.14 * (radius * radius);
		System.out.println(String.format("%.2f",area));
	}
}

class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void computeArea() {
		double area = (length * breadth);
		System.out.println(String.format("%.2f",area));
	}
}

class Triangle extends Shape{
	private double base;
	private double height;
	
	Triangle(double base,double height){
		this.base = base;
		this.height = height;
	}
	
	public void computeArea() {
		double area = 0.5 * base * height;
		System.out.println(String.format("%.2f",area));
	}
}




public class AreaOfShape {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		if (choice == 1) {
			double radius = s.nextDouble();
			Circle c = new Circle(radius);
			c.computeArea();
		}
		else if (choice == 2) {
			double num1 = s.nextDouble();
			double num2 = s.nextDouble();
			Rectangle c = new Rectangle(num1,num2);
			c.computeArea();
		}
		else if (choice == 3) {
			double num1 = s.nextDouble();
			double num2 = s.nextDouble();
			Triangle c = new Triangle(num1,num2);
			c.computeArea();
		}
		else {
			System.out.println("Invalid Choice");
		}

	}
}

