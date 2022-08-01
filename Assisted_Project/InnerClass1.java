package assisted_project;

public class InnerClass1 {
	

		private String msg="Have a nice day";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			InnerClass1  ob=new InnerClass1 ();  
			ob.display();  
			}
		}



