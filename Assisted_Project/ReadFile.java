package assisted_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
public static void main(String[] args) throws IOException {
	FileInputStream fc=new FileInputStream("D://AssistedProject//Ezhil");
	if(fc!=null)
		System.out.println("File exists");
	int i=0;
	while((i=fc.read())!=-1)
		System.out.print((char)i);
	fc.close();
}
}
