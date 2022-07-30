package assisted_project;

import java.util.Scanner;

public class TypeCasting {
           public static void main(String[] args) {
			int num1;
			double num2;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a first number");
			num1=sc.nextInt();
			System.out.println("Enter a second numbter");
			num2=sc.nextDouble();
			double ans1=num1;//implicit type casting
			int ans2=(int)num2;//explicit type casting
			System.out.println(ans1+" "+ans2);
		}
           
}
