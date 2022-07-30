package assisted_project;

//call by value
public class CallbyValue
{

int x=10;
static int method(int x) {
	
	x =x*20;
	return(x);
}

public static void main(String args[]) {
	CallbyValue sd=new CallbyValue();
	System.out.println("Before operation, the value is "+ sd.x);
	sd.method(40);
	System.out.println("After operation, the value  is "+ sd.x);
	}
}
