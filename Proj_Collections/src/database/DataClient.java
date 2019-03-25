package database;

import java.io.File;
import java.io.IOException;

import college.Student;
import lists.ArrayList;

public class DataClient {
	
	
	static String location = File.separator + "Users"
			+ File.separator + "Loren" 
			+ File.separator + "Desktop"
			+ File.separator + "CSC143"
			+ File.separator + "Proj_Collections"
			+ File.separator + "Files"
			+ File.separator + "College.txt";

	
	
	public static void main(String[] args) throws IOException {
		DataStorage daba = new DataStorage(location);

		ArrayList<Student> list = new ArrayList<Student>();
		
		daba.read();
		
		daba.parse(location);
		
		System.out.println(list.toString());
		
		System.out.println(list.size());
		
		
	}
}
