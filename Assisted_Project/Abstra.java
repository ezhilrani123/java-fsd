package assisted_project;
abstract class Calculator{
	public abstract void sum(int a ,int b);
	public abstract void mul(int a,int b);
}
class Calc extends Calculator{


	public void sum(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}


	public void mul(int a, int b) {
		System.out.println("Multiplication:"+(a*b));
		
	}
	
}


public class Abstra {
	public static void main(String[] args) {
		Calc d=new Calc();
		d.sum(7, 8);
		d.mul(3, 5);
	}

}
