package assisted_project;
class privateacces{
	private void show() {
		System.out.println("Private Access Specifier");
	}
}
public class AccessPrivate {
	public static void main(String[] args) {
		privateacces obj2=new privateacces();
		//obj2.show();
		display();
	}
	private static void display() {
		System.out.println("Access Specifier");
	}

}
