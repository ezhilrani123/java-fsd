package assisted_project;

public class Tryy {
public static void main(String[] args) {
	int a;
		try {
			
			a= 80/0;
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("End of execution");
		}
	}
}

