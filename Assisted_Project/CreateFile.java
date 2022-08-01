package assisted_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
public static void main(String[]args)throws IOException{
     String path="D:\\AssistedProject\\";
     Scanner sc=new Scanner(System.in);
     String Filename=sc.nextLine();
     String finalPath=path+Filename;
     File nw=new File(finalPath);
     
     boolean b=nw.createNewFile();
    if(b==true) {  
    	System.out.println("File is created");
    }else
    	System.out.println("File is not created");
     
    
 
}
	
}
