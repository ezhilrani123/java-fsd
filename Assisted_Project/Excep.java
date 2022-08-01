package assisted_project;


class Validage{
	void validation(int age) throws Invalidageexception {
	if( age>=18) {
		System.out.println("Right to vote");
		
	}
	else {
		throw new Invalidageexception("Not eligilible");
	}
	}
}
public class Excep {
	public static void main(String[] args) throws Invalidageexception {
		Validage gh=new Validage();
		gh.validation(21);
	}

}
