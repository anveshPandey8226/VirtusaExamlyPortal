package abstraction_ExceptionHandling;

import java.util.Scanner;

//You are using Java

interface Rotate{
	abstract void tractleftRotate(int arr[],int d, int n);
	abstract void leftRotateByOne(int arr[], int n);
	abstract void printArray(int arr[],int n);
}

class FuntionRotation implements Rotate{
	
	@Override
	public void tractleftRotate(int arr[],int d, int n){
	     System.out.println();
	 }
	
	@Override
	public void leftRotateByOne(int arr[], int n){
	     int j, first;
	     first = arr[0];
	     for(j = 0;j<arr.length-1;j++){
	         arr[j] = arr[j+1];
	     }
	     arr[j] = first;
	 }
	 
	@Override
	public void printArray(int arr[],int n){
	     for(int i = 0;i<arr.length;i++){
	         System.out.print(arr[i]+" ");
	     }
	 }
}


class Rotation{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i<num; i++) {
			arr[i] = s.nextInt();
		}
		
		FuntionRotation fr = new FuntionRotation();
		fr.leftRotateByOne(arr, num);
		fr.printArray(arr, num);
		
		
	}
}