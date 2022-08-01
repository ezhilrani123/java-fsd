package assisted_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UpdateFile {
public static void main(String[] args) throws IOException {
	FileInputStream nw=new FileInputStream("D:\\AssistedProject\\Ezhil");
	int i=0;
	while((i=nw.read())!=-1)
		System.out.print((char)i);
	Scanner sc=new Scanner(System.in);
	System.out.println("\n");
	System.out.println("Enter the text you want to update in a file");
	String dr=sc.nextLine();
	FileWriter ns=new FileWriter("D:\\AssistedProject\\Ezhil",true);
	ns.write(dr);
	System.out.println("Updated Successfully");
	ns.close();
}
}
