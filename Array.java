package assisted_project;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int Size=sc.nextInt();
	int a[]=new int[Size];
	for(int i=0;i<Size;i++) {
		System.out.println("Enter the "+(i+1) +" elements of array:");
		a[i]=sc.nextInt();
	
		}
	System.out.println("Elements of the array are:");
	for(int array:a) {
		
		System.out.println(array);
		
	
		}
		
	}

}