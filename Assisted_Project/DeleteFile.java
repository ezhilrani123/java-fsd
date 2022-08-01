package assisted_project;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
public static void main(String[] args) {
	String path="D:\\AssistedProject\\";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Filename which you wants to get deleted");
	String Filename=sc.nextLine();
	String Finalpath=path+Filename;
	File del=new File(Finalpath);
	del.delete();
	System.out.println("File gets deleted");
	
}
}
