package assisted_project;

public class ClassAndObject {
 int sid;
 String sname;
 String scollege;
public ClassAndObject(int sid, String sname, String scollege) {
	
	this.sid = sid;
	this.sname = sname;
	this.scollege = scollege;
	System.out.println("Roll Number: "+sid+"\n"+"Student Name: "+sname+"\n"+"College Name: "+scollege);
}
  public static void main(String[] args) {
	ClassAndObject we=new ClassAndObject(12,"Rani","CEG");
	
	
}
}
