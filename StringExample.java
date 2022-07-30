package assisted_project;

public class StringExample {

	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String sl=new String("Good Morning");
		System.out.println(sl.length());

		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));

		//String Comparison
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));

		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="GOOD";
		System.out.println(s5.toLowerCase());
		
		//toUppercase
		String s="good";
		System.out.println(s.toUpperCase());
		
		//replace
		String s6="File";
		String replace=s6.replace('l', 'n');
		System.out.println(replace);

		//equals
		String x="Welcome";
		String y="WeLcOmE";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer ss=new StringBuffer("Happy Morning ");
		ss.append("Enjoy your day");
		System.out.println(ss);

		//insert method
		ss.insert(0, 'H');
		System.out.println(ss);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Good");
		sb1.append(" Day");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}

