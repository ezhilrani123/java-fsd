package assisted_project;

import java.util.Scanner;

public class Method {
public static void main(String[] args) {
       System.out.println("Addition:Enter a two number");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
      int ans= add(a,b);
       System.out.println("Addition of "+a+" and "+b+" is " +ans);
	}
public static int add(int num1,int num2) {
	int ans=num1+num2;
	return ans;
}
}








