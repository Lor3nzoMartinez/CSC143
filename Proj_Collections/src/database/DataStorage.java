package database;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import college.Major;
import college.Rank;
import college.Student;
import lists.ArrayList;

public class DataStorage {
	
	private String file;
	
	public DataStorage(String filePath) throws IOException {
		setFile(filePath);	
	}
	
	public Student parse(String line) {
		String[] info = line.split(",");
		
		String name = info[0];
		int age = Integer.parseInt(info[1]);
		Rank rank = Rank.valueOf(info[2]);
		Major major = Major.valueOf(info[3]);
		double gpa = Double.parseDouble(info[4]);
		
		return new Student.Builder()
						  .setName(name)
						  .setAge(age)
						  .setRank(rank)
						  .setMajor(major)
						  .setGPA(gpa)
						  .build();

	}
	
	public ArrayList<Student> read() throws IOException {
		File file = new File(this.file);
		Scanner input = new Scanner(file);
		ArrayList<Student> studs = new ArrayList<Student>();
		while (input.hasNext()) {
			studs.add(parse(input.nextLine()));
		}
		input.close();
		return studs;
	}
	
	public void setFile(String filePath) {
		this.file = filePath;
	}
	
	public void write(ArrayList<Student> data) throws IOException {
		PrintStream writer = new PrintStream(file);
		
		for (int i = 0; i < data.size(); i++) {
			writer.println(data.get(i).toString() + "\n");
		}
		writer.close();
	}
	
	public void writeCS(ArrayList<Student> data) throws IOException {
		PrintStream writer = new PrintStream(file);
		
		for (int i = 0; i < data.size(); i++) {
			writer.println(data.get(i).toFile() + "\n");
		}
		writer.close();
	}
	
}
