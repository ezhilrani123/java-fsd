package assisted_project;

public class ThreadSample extends Thread {  
             public void run(){
            	 System.out.println("Hii User");
	
}
             public static void main(String[] args) {
				ThreadSample dc=new ThreadSample();
				dc.start();
			}
}
