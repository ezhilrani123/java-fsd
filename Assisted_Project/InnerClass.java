package assisted_project;

public class InnerClass {
	

		 private String msg="Good Morning Everyone "; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Welcome all");}  
		 }  


		public static void main(String[] args) {

			InnerClass obj=new InnerClass();
			InnerClass.Inner in=obj.new Inner();  
			in.hello();  
		}
	}


