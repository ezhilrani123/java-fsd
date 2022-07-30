package assisted_project;



public class MethodOverloading {
	//method overloading

		
	public static void over(int a)
	  {
	       System.out.println("Square of a number :"+(a*a));
	  }
	  public static void over(int a,int b) 
	  {
	       System.out.println("Addition of two number:"+(a+b));
	  }

	  public static void main(String args[])
	 {

	    over(4,5);
	    over(6);
	     
	 }
	}



