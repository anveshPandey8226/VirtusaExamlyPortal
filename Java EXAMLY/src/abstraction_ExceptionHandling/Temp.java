package abstraction_ExceptionHandling;

//You are using Java
import java.util.Scanner;
class DrivingLicenseException extends Exception{
 public DrivingLicenseException(String msg){
     super(msg);
 }
}

class Temp{
 public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     //System.out.println("Enter ur name :: ");
     String name = s.nextLine();
     //System.out.print(age)
     int age = s.nextInt();
     //SOP(marks)
     int marks = s.nextInt();
     try{
         if(marks<80 && marks>=0) 
             throw new DrivingLicenseException("InvalidMarkForDrivingLicenseException: Mark should be more than 80");
         if(marks<0)
             throw new DrivingLicenseException("InvalidMarkForDrivingLicenseException: Invalid mark");
         if(age<18 && age>=0)
             throw new DrivingLicenseException("InvalidAgeForDrivingLicenseException: Age should be more than 18 years old");
         if(age<0)
             throw new DrivingLicenseException("InvalidAgeForDrivingLicenseException: Invalid age");
         else 
             System.out.println("Approved");
     }
     catch(DrivingLicenseException a ){
         
         System.out.println(a.getMessage());
     }
 }
}