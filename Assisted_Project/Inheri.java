package assisted_project;

 class car{
	String colour="Blue";
	void dis() {
	System.out.println("Your car colour is "+colour);
	}
 }
 class RollsRoyce extends car{
	 int speed= 155;
	 void speed() {
		 System.out.println("Speed of the car is: "+speed);
	 }
 }
  class Royce extends RollsRoyce{
	  
	  int speed=167;
	  void Speedof() {
		  System.out.println("Speed of the car is: "+speed);
	  }
  }
 

public class Inheri {
	 public static void main(String[] args) {
		Royce sd=new Royce();
		sd.Speedof();
		sd.dis();
	}
	}