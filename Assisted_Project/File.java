package PracticeProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[]args) throws IOException {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("1.Write 2.Read 3.Append Choose the Operation which you want to do in a file");
    	int value =sc.nextInt();
    	
    	switch(value){
    	case 1:
    		write();
    		break;
    	case 2:
    		read();
    	    break;
    	case 3:
    		append();
    		break;
    		
    		
    	}
    }

	private static void write() throws IOException {
		FileWriter wo=new FileWriter("Ezhil");
		if(wo!=null) {
			System.out.println("file created and opened in write mode");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input for the file ");
		//sc.next(),sc.nextLine()
		String fileinput=sc.nextLine();
		//convert char into  bytes
		wo.write(fileinput);
		System.out.println("write operation completed");
		wo.close();

		
	}
	private static void read() throws IOException {
		FileInputStream fi=new FileInputStream("Ezhil");
		if(fi!=null) {
			System.out.println("file exists");
		}
		int i=0;
		//-1 is EOF
		while((i=fi.read())!=-1){
			System.out.print((char)i);
		}
	
		fi.close();
		
	}


	private static void append() throws IOException {
		FileWriter wo=new FileWriter("Ezhil",true);
		if(wo!=null) {
			System.out.println("file is ready to append");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input for the file ");
		//sc.next(),sc.nextLine()
		String fileinput=sc.nextLine();
		//convert char into  bytes
		wo.write(fileinput);
		System.out.println("Append operation completed");
		wo.close();
		
	}

	
}
